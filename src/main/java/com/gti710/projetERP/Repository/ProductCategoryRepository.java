package com.gti710.projetERP.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;

public class ProductCategoryRepository extends RepositoryBase<ProductCategory>{

	public ProductCategoryRepository(Connection connection) throws InstantiationException, IllegalAccessException 
	{
		super(connection, ProductCategory.class);
		// TODO Auto-generated constructor stub
	}

	
	public List<ProductTemplate> GetProductTemplateByProductCategory(int productCategoryid)
	{
		ProductTemplate pT = new ProductTemplate();
		List<ProductTemplate> pt = new ArrayList();
		try {
			String _query = "select * from product_template, product_category where product_template.categ_id= product_category.id and product_category.id = "+ productCategoryid;	
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            pt.add((ProductTemplate)pT.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return pt;
		
	}
	
}



