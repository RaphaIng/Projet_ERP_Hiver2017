package com.gti710.projetERP.Repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.ExtenderOdooModel;
import com.gti710.projetERP.Model.SalesOrder;
public class SalesOrderRepository extends RepositoryBase<SalesOrder> {
	

	
	public List<SalesOrder> GetSalesByStateEqualSale()
	{
		SalesOrder so = new SalesOrder();
		List<SalesOrder> ts = new ArrayList();
		try {
			String _query = "select sale_order.name, sale_order.date_order, res_partner.name, res_partner.street, res_partner.city from sale_order, res_partner where res_partner.id = sale_order.partner_id and sale_order.state = 'sale'";	
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            ts.add((SalesOrder)so.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return ts;
		
	}
	
	public List<SalesOrder> GetSalesByStatetoInvoice()
	{
		SalesOrder so = new SalesOrder();
		List<SalesOrder> ts = new ArrayList();
		try {
			String _query = "select sale_order.name, sale_order.date_order, res_partner.name, res_partner.street, res_partner.city from sale_order, res_partner where res_partner.id = sale_order.partner_id and sale_order.invoice_status = 'to invoice'";	
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            ts.add((SalesOrder)so.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return ts;
		
	}
	
	public void createSaleOrder(String invstat,String stat, String nameOrder,int res_partnerID, Float prixHT, Float Tax, Float prixTTC, int partner_invoiceID, int partner_shippingID, String dateorder, String pinkpol)
	{
		SalesOrder so = new SalesOrder();
		Tax = (float) (prixHT * 0.20);
		try {
			String _query = "insert into sale_order(invoice_status,state,name,partner_id, amount_untaxed, amount_tax, amount_total, partner_invoice_id, partner_shipping_id, date_order, pricelist_id, picking_policy, warehouse_id) values ('"+invstat+"','"+stat+"','"+nameOrder+"',"+res_partnerID+", "+prixHT+", "+Tax+", "+prixTTC+", "+partner_invoiceID+", "+partner_shippingID+", '"+dateorder+"',1, '"+pinkpol+"', 1)";	
			Statement stmt = super._dbConnection.createStatement();
			int _resultSet = stmt.executeUpdate(_query);				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub		
	}
	
	public int getLastSaleOrderID()
	{
		int maximum = 0;
		try {
			String _query = "select id from sale_order";	
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			while (_resultSet.next())
			{
				if (_resultSet.getInt("id")> maximum) 
					maximum = _resultSet.getInt("id");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		System.out.println(maximum);
		return maximum;
	}
	
	public SalesOrderRepository(Connection connection)throws InstantiationException, IllegalAccessException {
		super(connection, SalesOrder.class);
		// TODO Auto-generated constructor stub
	}
}

