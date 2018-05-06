package com.gti710.projetERP.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * The persistent class for the account_invoice database table.
 * 
 */
//@Entity
//@Table(name="account_invoice_line")
//@NamedQuery(name="AccountInvoiceLine.findAll", query="SELECT ainvl FROM AccountInvoiceLine ainvl")
public class AccountInvoiceLine extends ExtenderOdooModel {
	
	private Integer account_invoice_line_ID;
	private Integer account_id;
	private String create_date;
	private Float price_unit;
	private String name;
	private Integer quantity;
	private Integer currency_id;
	
	

	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "account_invoice_line";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		AccountInvoiceLine accountinvoiceline = new AccountInvoiceLine();
		
		try {
			accountinvoiceline.account_invoice_line_ID = resultSet.getInt("id");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountinvoiceline;
		
	}

}

