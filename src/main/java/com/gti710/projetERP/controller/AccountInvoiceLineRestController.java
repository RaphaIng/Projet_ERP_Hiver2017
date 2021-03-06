package com.gti710.projetERP.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gti710.projetERP.Model.AccountInvoice;
import com.gti710.projetERP.Model.AccountInvoiceLine;
import com.gti710.projetERP.Model.Clients;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Model.StockInventoryLine;
import com.gti710.projetERP.Repository.RepositoryFactory;
import com.gti710.projetERP.Service.AccountInvoiceLineService;
import com.gti710.projetERP.Service.AccountInvoiceService;
import com.gti710.projetERP.Service.ClientsService;
import com.gti710.projetERP.Service.ProductTemplateService;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;
import com.gti710.projetERP.Service.StockInventoryLineService;

@RestController
public class AccountInvoiceLineRestController extends BaseController {
	private AccountInvoiceLineService _accountInvoiceLineService;
	
	//@Autowired
	AccountInvoiceLineRestController() {
		super();
		this._accountInvoiceLineService = new AccountInvoiceLineService();
	}
	
	@RequestMapping(value = "/accountinvoicelines")
	  public ResponseEntity<List<AccountInvoiceLine>> available() {

		List<AccountInvoiceLine> ainvl =  super._repositoryFactory.AccountInvoiceLine().GetAll();
		
		String json = new Gson().toJson(ainvl);
		return ResponseEntity
	            .ok()
	            .body(ainvl);
	  }

}
