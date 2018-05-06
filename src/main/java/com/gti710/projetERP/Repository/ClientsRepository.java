package com.gti710.projetERP.Repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.Clients;
import com.gti710.projetERP.Model.ExtenderOdooModel;
import com.gti710.projetERP.Model.ProductTemplate;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
public class ClientsRepository extends RepositoryBase<Clients> {
	
	public ClientsRepository(Connection connection)throws InstantiationException, IllegalAccessException {
		super(connection, Clients.class);
		// TODO Auto-generated constructor stub
	}
	
	//public List<ProductTemplate> GetProductTemplateByProductCategory(int productCategoryid)
	
	public List<Clients> GetClientsById(int partenerId)

	{
		Clients pT = new Clients();
		List<Clients> cl = new ArrayList();
		try {
			//String _query = "select * from product_template, product_category where product_template.categ_id= product_category.id and product_category.id = "+ productCategoryid;	
			String _query = "select * from res_partner,sale_order where res_partner.id= sale_order.partner_id   and res_partner.id = "+ partenerId;	
			
			Statement stmt = super._dbConnection.createStatement();
			ResultSet _resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            cl.add((Clients)pT.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return cl;
		
	}

	
}

