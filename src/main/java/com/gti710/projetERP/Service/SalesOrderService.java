package com.gti710.projetERP.Service;

import java.util.List;

import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Repository.RepositoryFactory;

public class SalesOrderService {

	private RepositoryFactory repositoryFactory;
	private SalesOrderLineService salesOrderLineService;
	
	public SalesOrderService(RepositoryFactory p_repositoryFactory)
	{
		this.repositoryFactory = p_repositoryFactory;
		this.salesOrderLineService = new SalesOrderLineService(p_repositoryFactory);
	}
	
	public void CreateSaleOrder()
	{
		
		// 1 - Add in SaleOrder Row
		
		// 2 - Add SaleOrderLine Row
		this.salesOrderLineService.CreateSalesOrderLine(1,1,1);
		// 3 - 
	}
	
	public void AddSaleOrder()
	{
		
	}
}
