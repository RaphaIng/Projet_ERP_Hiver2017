package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductTemplateService;

@RestController
public class ProductTemplateRestController extends BaseController {
	private ProductTemplateService _productTemplateService;
	
	//@Autowired
	ProductTemplateRestController() {
		super();
		this._productTemplateService = new ProductTemplateService(super._repositoryFactory);
	}
	
	@RequestMapping(value = "/producttemplates")
	  public ResponseEntity<List<ProductTemplate>> available() {

		List<ProductTemplate> pp =  this._productTemplateService.GetAllProductsTemplate();
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }
	
	@RequestMapping(value = "/producttemplates/{id}")  
	public ResponseEntity<ProductTemplate> GetById(@PathVariable("id") int productCategoryId) {

		ProductTemplate pp =  super._repositoryFactory.ProductTemplate().GetProductTemplateById(productCategoryId);
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }

}
