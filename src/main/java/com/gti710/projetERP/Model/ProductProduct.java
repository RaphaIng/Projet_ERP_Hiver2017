package com.gti710.projetERP.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * The persistent class for the product_category database table.
 * 
 */
//@Entity
//@Table(name="product_product")
//@NamedQuery(name="ProductProduct.findAll", query="SELECT pp FROM ProductProduct pp")
public class ProductProduct extends ExtenderOdooModel {
	
	private Integer product_product_ID;
	private boolean active;
	private Integer product_template_ID;
	
	
	

	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "product_product";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		ProductProduct productproduct = new ProductProduct();
		
		try {
			productproduct.product_product_ID = resultSet.getInt("id");		
			productproduct.product_template_ID = resultSet.getInt("product_tmpl_id");	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productproduct;
		
	}

}

