package com.gti710.projetERP.Model;


import java.io.Serializable;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;


/**
 * The persistent class for the stock_inventory_line database table.
 * 
 */
//@Entity
//@Table(name="stock_inventory_line")
//@NamedQuery(name="StockInventoryLine.findAll", query="SELECT sil FROM StockInventoryLine sil")
public class StockInventoryLine extends  ExtenderOdooModel implements Serializable  {
	private static final long serialVersionUID = 1L;

	//@Id
	private Integer stockInventoryLine_ID;

	private Integer product_qty;
	private String product_code;
	private Integer product_ID;
	private Integer product_uom_id;
	private Integer location_id;
	private String product_name;
	private Integer inventoryID;

	
	public StockInventoryLine() {
	}

	

	public Integer getStockInventoryLine_ID() {
		return stockInventoryLine_ID;
	}



	public void setStockInventoryLine_ID(Integer stockInventoryLine_ID) {
		this.stockInventoryLine_ID = stockInventoryLine_ID;
	}



	public Integer getProduct_qty() {
		return product_qty;
	}



	public void setProduct_qty(Integer product_qty) {
		this.product_qty = product_qty;
	}



	public String getProduct_code() {
		return product_code;
	}



	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}



	public Integer getProduct_ID() {
		return product_ID;
	}



	public void setProduct_ID(Integer product_ID) {
		this.product_ID = product_ID;
	}



	public Integer getProduct_uom_id() {
		return product_uom_id;
	}



	public void setProduct_uom_id(Integer product_uom_id) {
		this.product_uom_id = product_uom_id;
	}



	public Integer getLocation_id() {
		return location_id;
	}



	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}



	public String getProduct_name() {
		return product_name;
	}



	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}



	public Integer getInventoryID() {
		return inventoryID;
	}



	public void setInventoryID(Integer inventoryID) {
		this.inventoryID = inventoryID;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "stock_inventory_line";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		StockInventoryLine stockinventoryline = new StockInventoryLine();
		
		try {
			stockinventoryline.product_name = resultSet.getString("name");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockinventoryline;
		
	}

}