package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Model.StockInventoryLine;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ProductTemplateService;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;
import com.gti710.projetERP.Service.StockInventoryLineService;

@RestController
public class StockInventoryLineRestController extends BaseController {
	private StockInventoryLineService _stockInventoryLineService;
	
	//@Autowired
	StockInventoryLineRestController() {
		super();
		this._stockInventoryLineService = new StockInventoryLineService();
	}
	
	@RequestMapping(value = "/stockinventorylines")
	  public ResponseEntity<List<StockInventoryLine>> available() {

		List<StockInventoryLine> sil =  super._repositoryFactory.StockInventoryLine().GetAll();
		
		String json = new Gson().toJson(sil);
		return ResponseEntity
	            .ok()
	            .body(sil);
	  }

}
