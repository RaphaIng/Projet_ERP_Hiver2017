package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Model.StockInventory;
import com.gti710.projetERP.Model.StockInventoryLine;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductTemplateService;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;
import com.gti710.projetERP.Service.StockInventoryLineService;
import com.gti710.projetERP.Service.StockInventoryService;

@RestController
public class StockInventoryRestController extends BaseController {
	private StockInventoryService _stockInventoryService;
	
	//@Autowired
	StockInventoryRestController() {
		super();
		this._stockInventoryService = new StockInventoryService();
	}
	
	@RequestMapping(value = "/stockinventory")
	  public ResponseEntity<List<StockInventory>> available() {

		List<StockInventory> si =  super._repositoryFactory.StockInventory().GetAll();
		
		String json = new Gson().toJson(si);
		return ResponseEntity
	            .ok()
	            .body(si);
	  }

}
