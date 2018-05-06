package com.gti710.projetERP.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Repository.RepositoryFactory;

public class ProductTemplateService {
	
	private RepositoryFactory repositoryFactory;
	
	public ProductTemplateService(RepositoryFactory p_repositoryFactory)
	{
		this.repositoryFactory = p_repositoryFactory;
	}
	
	public List<ProductTemplate> GetAllProductsTemplate()
	{
		List<ProductTemplate> productsTemplate = new ArrayList<ProductTemplate>();
		
		// Get All Product Template 
		productsTemplate.addAll(this.repositoryFactory.ProductTemplate().GetAll());
		
		// Marge image to Product template
	/*	for (Iterator<ProductTemplate> i = productsTemplate.iterator(); i.hasNext();) {
			ProductTemplate _productTemplate = i.next();
			_productTemplate.setImageUrl(SetProductTemplateImageUrl(_productTemplate)); 
		}*/
		
		
		return productsTemplate;
	}
	
	//private String SetProductTemplateImageUrl(ProductTemplate _productTemplate)
	{
		
		//this.repositoryFactory.ProductTemplate().setProductTemplateImageUrl(_productTemplate.getId());
		//return this.repositoryFactory.ProductTemplate().getProductTemplateImageUrl();
	}
	
	
	

}
