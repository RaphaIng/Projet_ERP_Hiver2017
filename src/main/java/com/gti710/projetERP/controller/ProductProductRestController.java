package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.ProductProduct;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductProductService;
import com.gti710.projetERP.Service.ProductTemplateService;

@RestController
public class ProductProductRestController extends BaseController {
	private ProductProductService _productproductService;
	
	//@Autowired
	ProductProductRestController() {
		super();
		this._productproductService = new ProductProductService();
	}
	
	@RequestMapping(value = "/productproduct")
	  public ResponseEntity<List<ProductProduct>> available() {

		List<ProductProduct> pp =  super._repositoryFactory.ProductProduct().GetAll();
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }

}
