package com.gti710.projetERP.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.Clients;
import com.gti710.projetERP.Model.ProductTemplate;

public class ProductTemplateRepository extends RepositoryBase<ProductTemplate>{
	
	public ProductTemplate GetProductTemplateById(int p_productTemplateId)
	{
		ProductTemplate _productTemplate = new ProductTemplate();
		ProductTemplate tp  = new ProductTemplate();
		try {
			String _query = "select * from product_template where id = "+ p_productTemplateId;		
			
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 if (_resultSet.next()) {
				 tp = (ProductTemplate) _productTemplate.MapToModel(_resultSet);
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return tp;
		
	}
	
	
	
	public ProductTemplateRepository(Connection connection) throws InstantiationException, IllegalAccessException {
		
		super(connection, ProductTemplate.class);
		// TODO Auto-generated constructor stub
	}

}



