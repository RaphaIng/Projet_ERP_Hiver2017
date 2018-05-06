package com.gti710.projetERP.Service;

import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Repository.RepositoryFactory;

public class ProductCategoryService {

	
	private RepositoryFactory repositoryFactory;
	
	public ProductCategoryService(RepositoryFactory p_repositoryFactory)
	{
		this.repositoryFactory = p_repositoryFactory;
	}
	
	public List<ProductCategory> GetAllProductsCategory()
	{
		List<ProductCategory> productsCategory = new ArrayList<ProductCategory>();
		
		// Get All Product Categories 
		productsCategory.addAll(this.repositoryFactory.ProductCategory().GetAll());
		
		return productsCategory;
	}
	
	public List<ProductCategory> GetProductTemplateByProductCategory(int product_category)
	{
		List<ProductCategory> productsCategory = new ArrayList<ProductCategory>();
		
		// Get All Product Template 
		productsCategory.addAll(this.repositoryFactory.ProductCategory().GetAll());
		
		return productsCategory;
	}
}
