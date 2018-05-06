package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.Clients;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Model.StockInventoryLine;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.ClientsService;
import com.gti710.projetERP.Service.ProductTemplateService;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;
import com.gti710.projetERP.Service.StockInventoryLineService;

@RestController
public class ClientsRestController extends BaseController {
	private ClientsService _clientsService;
	
	//@Autowired
	ClientsRestController() {
		super();
		this._clientsService = new ClientsService();
	}
	
	@RequestMapping(value = "/respartners")
	  public ResponseEntity<List<Clients>> available() {

		List<Clients> cli =  super._repositoryFactory.Clients().GetAll();
		
		String json = new Gson().toJson(cli);
		return ResponseEntity
	            .ok()
	            .body(cli);
	  }
	
	@RequestMapping(value = "/respartners/{id}")
	  public ResponseEntity<List<Clients>> GetClients(@PathVariable("id") int partnerId) {

		List<Clients> cl =  super._repositoryFactory.Clients().GetClientsById(partnerId);
		
		String json = new Gson().toJson(cl );
		return ResponseEntity
	            .ok()
	            .body(cl);
	  }
	
}
