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
import com.gti710.projetERP.Model.SalesOrderLine;
public class SalesOrderLineRepository extends RepositoryBase<SalesOrderLine> {
	
	public List<SalesOrderLine> GetSaleOrderLinesBySaleOrder(int p_saleOrderid)
	{
		SalesOrderLine so = new SalesOrderLine();
		List<SalesOrderLine> ts = new ArrayList();
		try {
			// Jointure entre Sale_Order et Sale_Order_Line avec {id,order_id} comme champ correspondants
			String _query = "select * from sale_order_line, sale_order where sale_order.id = sale_order_line.order_id and sale_order.id= "+ p_saleOrderid;	
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            ts.add((SalesOrderLine)so.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return ts;
		
	}
	
	
/*	INSERT INTO sale_order_line (product_uom, price_unit,product_uom_qty, customer_lead, order_id, product_id, name)
	VALUES (1, need_query_to_productId, qty_receive_byClient, 0, receveby_saleorder, recevebyclcient, need_query_to_productId)

	INSERT INTO sale_order_line (product_uom, price_unit,product_uom_qty, customer_lead, order_id, product_id, name)
	VALUES (1, '2.66', '5',  0, 3, 18, 'Carotte')*/


	public void CreateSalesOrderLine(int p_saleOrderid, SalesOrderLine p_salesOrderLine)
	{
		try {
			String _query = "INSERT INTO sale_order_line (product_uom, price_unit,product_uom_qty, customer_lead, order_id, product_id, name)"
					+ " VALUES (" +p_salesOrderLine.getProduct_uom()+","+p_salesOrderLine.getPrice_unit()+","
					+p_salesOrderLine.getProduct_uom_qty()+","+p_salesOrderLine.getCustomer_lead()+","
					+ p_saleOrderid+","+p_salesOrderLine.getProduct_id()+",'"+p_salesOrderLine.getName()+"')";
					
			Statement stmt = super._dbConnection.createStatement();
			int _resultSet = stmt.executeUpdate(_query);	
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		
	
	public SalesOrderLineRepository(Connection connection)throws InstantiationException, IllegalAccessException {
		super(connection, SalesOrderLine.class);
		// TODO Auto-generated constructor stub
	}
}

