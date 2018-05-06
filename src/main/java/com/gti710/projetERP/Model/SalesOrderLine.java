package com.gti710.projetERP.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * The persistent class for the sale_order_line database table.
 * 
 */
//@Entity
//@Table(name="sale_order_line")
//@NamedQuery(name="SalesOrder.findAll", query="SELECT sol FROM SalesOrderLine sol")
public class SalesOrderLine extends ExtenderOdooModel {
	
	private int product_uom;// Always 1
	private String price_unit;
	private int product_uom_qty;
	private int customer_lead; // Always 0
	private int order_id;
	private int product_id; // product_template id
	private String name; // product_template template name

	public String getPrice_unit() {
		return price_unit;
	}

	public void setPrice_unit(String price_unit) {
		this.price_unit = price_unit;
	}

	public int getProduct_uom_qty() {
		return product_uom_qty;
	}

	public void setProduct_uom_qty(int product_uom_qty) {
		this.product_uom_qty = product_uom_qty;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProduct_uom() {
		return 1;
	}

	public int getCustomer_lead() {
		return 0;
	}

	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "sale_order_line";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		SalesOrderLine saleorderline = new SalesOrderLine();
		
		try {
			saleorderline.setName(resultSet.getString("name"));			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saleorderline;
		
	}

}

