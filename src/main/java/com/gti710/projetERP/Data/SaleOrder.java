package com.gti710.projetERP.Data;

import java.util.ArrayList;
import java.util.List;


public class SaleOrder {

	public List <ProductTemplate> productTemplates;
	public float prixHT;
	public float tax;
	public float prixTTC;
	public int res_partner_ID;
	
	public SaleOrder()
	{
		productTemplates = new ArrayList<ProductTemplate>();
	}
}
