package com.gti710.projetERP.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the product_category database table.
 * 
 */
//@Entity
//@Table(name="sale_order")
//@NamedQuery(name="SalesOrder.findAll", query="SELECT so FROM SalesOrder so")
public class SalesOrder extends ExtenderOdooModel {
	
	private int sale_order_PartnerID;
	private int sale_order_Partner_Shipping;
	private String state;
	private String sale_order_invoice_status;
	private String sale_order_name;				// Suspecte que c'est le primary key de la table car valeurs SO001, SO002, SO...
	private String sale_order_pickingPolicy;
	private Date date_order;
	
	
	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "sale_order";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		SalesOrder saleorder = new SalesOrder();
		
		try {
			saleorder.sale_order_name = resultSet.getString("name");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saleorder;
		
	}

	
	
	public Date getDate_order() {
		return date_order;
	}

	public void setDate_order(Date date_order) {
		this.date_order = date_order;
	}

	public void setSale_order_Partner_Shipping(int sale_order_Partner_Shipping) {
		this.sale_order_Partner_Shipping = sale_order_Partner_Shipping;
	}

	public int getSale_order_PartnerID() {
		return sale_order_PartnerID;
	}

	public void setSale_order_PartnerID(int sale_order_PartnerID) {
		this.sale_order_PartnerID = sale_order_PartnerID;
	}

	public int getSale_order_Partner_Shipping() {
		return sale_order_Partner_Shipping;
	}

	public void setSale_order_Partner_Shipping(Integer sale_order_Partner_Shipping) {
		this.sale_order_Partner_Shipping = sale_order_Partner_Shipping;
	}

		public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSale_order_invoice_status() {
		return sale_order_invoice_status;
	}

	public void setSale_order_invoice_status(String sale_order_invoice_status) {
		this.sale_order_invoice_status = sale_order_invoice_status;
	}

	public String getSale_order_name() {
		return sale_order_name;
	}

	public void setSale_order_name(String sale_order_name) {
		this.sale_order_name = sale_order_name;
	}

	public String getSale_order_pickingPolicy() {
		return sale_order_pickingPolicy;
	}

	public void setSale_order_pickingPolicy(String sale_order_pickingPolicy) {
		this.sale_order_pickingPolicy = sale_order_pickingPolicy;
	}

}

