package com.gti710.projetERP.Repository;

import java.sql.Connection;

import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Model.ProductProduct;

public class ProductProductRepository extends RepositoryBase<ProductProduct>{

	public ProductProductRepository(Connection connection) throws InstantiationException, IllegalAccessException {
		
		super(connection, ProductProduct.class);
		// TODO Auto-generated constructor stub
	}

}



