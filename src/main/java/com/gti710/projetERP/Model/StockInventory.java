package com.gti710.projetERP.Model;


import java.io.Serializable;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;


/**
 * The persistent class for the stock_inventory database table.
 * 
 */
//@Entity
//@Table(name="stock_inventory")
//@NamedQuery(name="StockInventory.findAll", query="SELECT si FROM StockInventory si")
public class StockInventory extends  ExtenderOdooModel implements Serializable  {
	private static final long serialVersionUID = 1L;

	//@Id
	private Integer stockInventory_ID;

	private String create_date;
	private Integer company_id;
	private String date;
	private Integer product_id;
	private String stockInventory_name;
	private String filter;
	private Integer category_ID;
	private Integer location_id;
	

	
	public Integer getStockInventory_ID() {
		return stockInventory_ID;
	}






	public void setStockInventory_ID(Integer stockInventory_ID) {
		this.stockInventory_ID = stockInventory_ID;
	}






	public String getCreate_date() {
		return create_date;
	}






	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}






	public Integer getCompany_id() {
		return company_id;
	}






	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}






	public String getDate() {
		return date;
	}






	public void setDate(String date) {
		this.date = date;
	}






	public Integer getProduct_id() {
		return product_id;
	}






	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}






	public String getStockInventory_name() {
		return stockInventory_name;
	}






	public void setStockInventory_name(String stockInventory_name) {
		this.stockInventory_name = stockInventory_name;
	}






	public String getFilter() {
		return filter;
	}






	public void setFilter(String filter) {
		this.filter = filter;
	}






	public Integer getCategory_ID() {
		return category_ID;
	}






	public void setCategory_ID(Integer category_ID) {
		this.category_ID = category_ID;
	}






	public Integer getLocation_id() {
		return location_id;
	}






	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}






	public static long getSerialversionuid() {
		return serialVersionUID;
	}






	public StockInventory() {
	}

	

	


	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "stock_inventory_line";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		StockInventory stockinventoryline = new StockInventory();
		
		try {
			stockinventoryline.stockInventory_name = resultSet.getString("name");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockinventoryline;
		
	}

}