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
//@Table(name="account_invoice")
//@NamedQuery(name="AccountInvoice.findAll", query="SELECT ainv FROM AccountInvoice ainv")
public class AccountInvoice extends ExtenderOdooModel {
	
	private Integer account_invoice_ID;
	private String date_due;
	private String create_date;
	private Float totalAmount;
	private String name;
	private String state;
	private String type;
	private Integer journalID;
	private Integer company_id;
	private Integer account_id;
	private String reference;
	private String referenceType;
	private Integer currency_id;
	private String comment;
	private boolean sent=false;
	private Integer partner_id;
	private Integer partner_bank_id;
	
	
	public Integer getAccount_invoice_ID() {
		return account_invoice_ID;
	}

	public void setAccount_invoice_ID(Integer account_invoice_ID) {
		this.account_invoice_ID = account_invoice_ID;
	}

	public String getDate_due() {
		return date_due;
	}

	public void setDate_due(String date_due) {
		this.date_due = date_due;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getJournalID() {
		return journalID;
	}

	public void setJournalID(Integer journalID) {
		this.journalID = journalID;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public Integer getAccount_id() {
		return account_id;
	}

	public void setAccount_id(Integer account_id) {
		this.account_id = account_id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getReferenceType() {
		return referenceType;
	}

	public void setReferenceType(String referenceType) {
		this.referenceType = referenceType;
	}

	public Integer getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(Integer currency_id) {
		this.currency_id = currency_id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isSent() {
		return sent;
	}

	public void setSent(boolean sent) {
		this.sent = sent;
	}

	public Integer getPartner_id() {
		return partner_id;
	}

	public void setPartner_id(Integer partner_id) {
		this.partner_id = partner_id;
	}

	public Integer getPartner_bank_id() {
		return partner_bank_id;
	}

	public void setPartner_bank_id(Integer partner_bank_id) {
		this.partner_bank_id = partner_bank_id;
	}

	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "account_invoice";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		AccountInvoice accountinvoice = new AccountInvoice();
		
		try {
			accountinvoice.account_invoice_ID = resultSet.getInt("id");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountinvoice;
		
	}

}

