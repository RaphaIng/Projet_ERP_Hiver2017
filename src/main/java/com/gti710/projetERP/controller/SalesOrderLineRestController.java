package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Data.SaleOrder;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductTemplateService;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;

@RestController
public class SalesOrderLineRestController extends BaseController {
	private SalesOrderLineService _saleOrderLineService;

	
	//@Autowired
	SalesOrderLineRestController() {
		super();
		this._saleOrderLineService = new SalesOrderLineService(super._repositoryFactory);
	}
		
	@RequestMapping(value = "/saleorderlines")
	  public ResponseEntity<List<SalesOrderLine>> available() {

		List<SalesOrderLine> sol =  super._repositoryFactory.SalesOrderLine().GetAll();
		
		String json = new Gson().toJson(sol);
		return ResponseEntity
	            .ok()
	            .body(sol);
	  }
	
	
	@RequestMapping(value = "saleorders/{saleOrderID}/salesorderlines", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = "application/json;charset=UTF-8") 
	public ResponseEntity<List<SalesOrderLine>> AddSaleOrder(
			@PathVariable int saleOrderID,@RequestBody SaleOrder input) {
		
		this._saleOrderLineService.CreateSalesOrderLine(3,18,6);
		

		//List<SalesOrderLine> pp =  super._repositoryFactory.SalesOrderLine().GetSaleOrderLinesBySaleOrder(clientID);
		
		//String json = new Gson().toJson(pp );
		//return ResponseEntity
	            return null;
	  }
	


}
