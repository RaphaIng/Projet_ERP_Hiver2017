package com.gti710.projetERP.Repository;

import java.sql.Connection;

import com.gti710.projetERP.Model.OdooConnection;

public class RepositoryFactory {

	private ProductTemplateRepository _productTemplate;
	private ProductCategoryRepository _productCategory;
	private ProductProductRepository _productProduct;
	private SalesOrderRepository _saleorder;
	private SalesOrderLineRepository _saleorderline;
	private StockInventoryLineRepository _stockinventoryline;
	private StockInventoryRepository _stockinventory;
	private AccountInvoiceRepository _accountInvoice;
	private AccountInvoiceLineRepository _accountInvoiceline;
	private ClientsRepository _clients;
	private Connection _dbConnection;
	
	public ProductTemplateRepository ProductTemplate()
	{
		if(this._productTemplate == null)
		{
			try {
				_productTemplate = new ProductTemplateRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _productTemplate;
		}
		else
		{
			return _productTemplate;
		}
	}
	
	public ProductCategoryRepository ProductCategory()
	{
		if(this._productCategory == null)
		{
			try {
				_productCategory = new ProductCategoryRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _productCategory;
		}
		else
		{
			return _productCategory;
		}
	}
	
	public AccountInvoiceRepository AccountInvoice()
	{
		if(this._accountInvoice == null)
		{
			try {
				_accountInvoice = new AccountInvoiceRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _accountInvoice;
		}
		else
		{
			return _accountInvoice;
		}
	}
	
	public AccountInvoiceLineRepository AccountInvoiceLine()
	{
		if(this._accountInvoiceline == null)
		{
			try {
				_accountInvoiceline = new AccountInvoiceLineRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _accountInvoiceline;
		}
		else
		{
			return _accountInvoiceline;
		}
	}
	
	public ProductProductRepository ProductProduct()
	{
		if(this._productProduct == null)
		{
			try {
				_productProduct = new ProductProductRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _productProduct;
		}
		else
		{
			return _productProduct;
		}
	}
	
	
	public SalesOrderRepository SalesOrder()
	{
		if(this._saleorder == null)
		{
			try {
				_saleorder = new SalesOrderRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _saleorder;
		}
		else
		{
			return _saleorder;
		}
	}
	
	public SalesOrderLineRepository SalesOrderLine()
	{
		if(this._saleorderline == null)
		{
			try {
				_saleorderline = new SalesOrderLineRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _saleorderline;
		}
		else
		{
			return _saleorderline;
		}
	}
	
	public StockInventoryLineRepository StockInventoryLine()
	{
		if(this._stockinventoryline == null)
		{
			try {
				_stockinventoryline = new StockInventoryLineRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _stockinventoryline;
		}
		else
		{
			return _stockinventoryline;
		}
	}
	
	public StockInventoryRepository StockInventory()
	{
		if(this._stockinventory == null)
		{
			try {
				_stockinventory = new StockInventoryRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _stockinventory;
		}
		else
		{
			return _stockinventory;
		}
	}
	
	
	public ClientsRepository Clients()
	{
		if(this._clients == null)
		{
			try {
				_clients = new ClientsRepository(_dbConnection);
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return _clients;
		}
		else
		{
			return _clients;
		}
	}
	
	
	public RepositoryFactory(OdooConnection db)
	{	
		_dbConnection = db._dbConnection;  
	}
}
