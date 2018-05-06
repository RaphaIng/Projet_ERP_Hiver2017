package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.ProductCategory;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductCategoryService;
import com.gti710.projetERP.Service.ProductTemplateService;

@RestController
public class ProductCategoryRestController extends BaseController {
	private ProductCategoryService _productCategoryService;
	
	//@Autowired
	ProductCategoryRestController() {
		super();
		this._productCategoryService = new ProductCategoryService(super._repositoryFactory);
	}
	
	@RequestMapping(value = "/productcategories")
	  public ResponseEntity<List<ProductCategory>> available() {

		List<ProductCategory> pp =  super._repositoryFactory.ProductCategory().GetAll();
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }
	
	@RequestMapping(value = "/productcategories/{id}/producttemplates")
	  public ResponseEntity<List<ProductTemplate>> GetAllProductTemplate(@PathVariable("id") int productCategoryId) {

		List<ProductTemplate> pt =  super._repositoryFactory.ProductCategory().GetProductTemplateByProductCategory(productCategoryId);
		
		String json = new Gson().toJson(pt );
		return ResponseEntity
	            .ok()
	            .body(pt);
	  }

}
