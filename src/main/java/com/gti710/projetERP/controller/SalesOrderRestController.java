package com.gti710.projetERP.controller;

//import static java.nio.charset.StandardCharsets.ISO_8859_1;
//import static java.nio.charset.StandardCharsets.UTF_8;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;







import com.google.gson.Gson;
import com.gti710.projetERP.Data.ProductTemplate;
import com.gti710.projetERP.Data.SaleOrder;
import com.gti710.projetERP.Model.Clients;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Service.SalesOrderLineService;
import com.gti710.projetERP.Service.SalesOrderService;

@RestController
public class SalesOrderRestController extends BaseController {
	private SalesOrderService saleOrderService;
	private SalesOrderLineService saleOrderLineService;
	private SaleOrder toSale;
	//public static final String WEB_HOST = "http://localhost:8000";
	//public static final JsonObject objetJson = null;
	
	
	//@Autowired
	SalesOrderRestController() {
		super();
		this.saleOrderService = new SalesOrderService(super._repositoryFactory);
		this.saleOrderLineService = new SalesOrderLineService(super._repositoryFactory);
	}

	
	
	@RequestMapping(value = "/salesorders/sale")
	  public ResponseEntity<List<SalesOrder>> GetByStateEqualSale() {

		List<SalesOrder> pp =  super._repositoryFactory.SalesOrder().GetSalesByStateEqualSale();
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }
	
	@RequestMapping(value = "/salesorders/todeliver")
	  public ResponseEntity<List<SalesOrder>> GetSalesByStatetoInvoice() {

		List<SalesOrder> pp =  super._repositoryFactory.SalesOrder().GetSalesByStatetoInvoice();
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }
	

	
	@RequestMapping(value = "/salesorders/{id}/salesorderslines")
	  public ResponseEntity<List<SalesOrderLine>> GetAllSaleOrderLine(@PathVariable("id") int saleOrderId) {

		List<SalesOrderLine> pp =  super._repositoryFactory.SalesOrderLine().GetSaleOrderLinesBySaleOrder(saleOrderId);
		
		String json = new Gson().toJson(pp );
		return ResponseEntity
	            .ok()
	            .body(pp);
	  }
	
	private SaleOrder Cast(String p_receive)
	{
		
		JSONObject obj;
		return null;
		
	}
	
	//@RequestMapping(method = RequestMethod.GET)
	@RequestMapping(value = "clients/{clientID}/tosale/", method = RequestMethod.POST,  produces = "application/json;charset=UTF-8")
	  public ResponseEntity<List<ProductTemplate>> AddSaleOrder(@PathVariable String clientID, @RequestBody String input) {
		
		JSONObject _rootJson = new JSONObject(input);
		JSONArray _arrayJson =new JSONArray(_rootJson.get("productTemplates").toString());
	
		
		
		
		toSale = new SaleOrder();
		toSale.res_partner_ID = Integer.parseInt(_rootJson.get("res_partner_ID").toString());
		toSale.prixHT = Float.parseFloat(_rootJson.get("prixHT").toString());
		toSale.prixTTC = Float.parseFloat(_rootJson.get("prixTTC").toString());
		toSale.tax = Float.parseFloat(_rootJson.get("tax").toString());
		
		System.out.println(toSale);
		
		

		for (int i=0; i<_arrayJson.length(); i++) {
			ProductTemplate _productTemplate = new ProductTemplate();
			_productTemplate.idp = Integer.parseInt(_arrayJson.getJSONObject(i).get("idp").toString());
			_productTemplate.quantity = Integer.parseInt(_arrayJson.getJSONObject(i).get("quantity").toString());
			toSale.productTemplates.add(_productTemplate);
		}
		//{
			//toSale.productTemplate. = input.productTemplate.get(i).id;
			//toSale.productTemplate.get(i).quantity = input.productTemplate.get(i).quantity;
			//toSale.productTemplate.add(input.productTemplate.get(i));
		//}
		for (int i=0; i<toSale.productTemplates.size(); i++)
		{
			System.out.println("Le ID du produit est : " + toSale.productTemplates.get(i).idp);
			System.out.println("La quantité commandée est : " + toSale.productTemplates.get(i).quantity);
		}
		
		SalesOrder so = new SalesOrder();
		
		so.setSale_order_Partner_Shipping(toSale.res_partner_ID);
		System.out.println(toSale.res_partner_ID);
		so.setSale_order_pickingPolicy("direct");
		so.setState("sale");
		so.setSale_order_invoice_status("invoiced");
		int MaxOrderID =  super._repositoryFactory.SalesOrder().getLastSaleOrderID()+1;
		String indice = String.format("%03d",MaxOrderID);
		so.setSale_order_name("SO" +indice);
		System.out.println(so.getSale_order_name());
		String name = so.getSale_order_name();
		so.setDate_order(new java.util.Date());
		
		// création du SaleOrder
		super._repositoryFactory.SalesOrder().createSaleOrder(so.getSale_order_invoice_status(),so.getState(),name,toSale.res_partner_ID, toSale.prixHT, toSale.tax, toSale.prixTTC, toSale.res_partner_ID, toSale.res_partner_ID, so.getDate_order().toString(), so.getSale_order_pickingPolicy());

		for (int i=0; i<toSale.productTemplates.size(); i++)
		{
			this.saleOrderLineService.CreateSalesOrderLine(super._repositoryFactory.SalesOrder().getLastSaleOrderID(), toSale.productTemplates.get(i).idp ,(int) toSale.productTemplates.get(i).quantity);
		}
		//List<SalesOrderLine> pp =  super._repositoryFactory.SalesOrderLine().GetSaleOrderLinesBySaleOrder(clientID);
		
		String json = new Gson().toJson(toSale.productTemplates);
		return ResponseEntity
				.ok()
				.body(toSale.productTemplates);
	  }
	



}


