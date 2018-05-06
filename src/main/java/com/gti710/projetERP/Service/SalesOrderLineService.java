package com.gti710.projetERP.Service;

import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Repository.RepositoryFactory;

public class SalesOrderLineService {
	private RepositoryFactory repositoryFactory;
	private ProductTemplate productTemplate;
	private SalesOrderLine salesOrderLine;
	
	public SalesOrderLineService(RepositoryFactory p_repositoryFactory)
	{
		this.repositoryFactory = p_repositoryFactory;
		this.productTemplate = new ProductTemplate();
		this.salesOrderLine = new SalesOrderLine();
	}
	
	public void CreateSalesOrderLine(int p_saleOrderId, int p_productTemplateId ,int p_quantity)
	{
		// 1 - Get product_template : Name , price_unit, product_id
		this.productTemplate = this.repositoryFactory.ProductTemplate().GetProductTemplateById(p_productTemplateId);
		this.salesOrderLine.setName(productTemplate.getProduct_template_name());
		this.salesOrderLine.setPrice_unit(productTemplate.getProduct_template_list_price());
		this.salesOrderLine.setProduct_id(productTemplate.getProduct_template_ID());
		this.salesOrderLine.setProduct_uom_qty(p_quantity);
		// 2  - Add SalesOrderLine
		AddSalesOrderLine(p_saleOrderId, this.salesOrderLine);
	}
	
	private void AddSalesOrderLine(int p_saleOrderId, SalesOrderLine p_salesOrderLine)
	{
		this.repositoryFactory.SalesOrderLine().CreateSalesOrderLine(p_saleOrderId, p_salesOrderLine);
	}
	
	

}
