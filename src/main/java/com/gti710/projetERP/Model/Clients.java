package com.gti710.projetERP.Model;

import java.io.Serializable;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * The persistent class for the res_partner database table.
 * 
 */
//@Entity
//@Table(name="res_partner")
//@NamedQuery(name="Clients.findAll", query="SELECT cli FROM Clients cli")
public class Clients extends ExtenderOdooModel {
	
	private Integer res_partner_ID;
	private String name;
	private Integer company_id;
	private String create_date;
	private String write_date;
	private String phone;
	private String street;
	private String city;
	private String zip;
	private String ref;
	private String notify_email;
	private String picking_warn;
	private String invoice_warn;
	private String sale_warn;
	private String purchase_warn;
	private Integer country_id;
	private String street2;
	private String email;
	private String comment;
	private String website;
	private String color;
	private boolean active = true;
	private String supplier;
	private String display_name;
	private String title;
	private String commercial_company_name;
	private Integer parent_id;
	private String company_name;
	public Integer getRes_partner_ID() {
		return res_partner_ID;
	}

	public void setRes_partner_ID(Integer res_partner_ID) {
		this.res_partner_ID = res_partner_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getWrite_date() {
		return write_date;
	}

	public void setWrite_date(String write_date) {
		this.write_date = write_date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getNotify_email() {
		return notify_email;
	}

	public void setNotify_email(String notify_email) {
		this.notify_email = notify_email;
	}

	public String getPicking_warn() {
		return picking_warn;
	}

	public void setPicking_warn(String picking_warn) {
		this.picking_warn = picking_warn;
	}

	public String getInvoice_warn() {
		return invoice_warn;
	}

	public void setInvoice_warn(String invoice_warn) {
		this.invoice_warn = invoice_warn;
	}

	public String getSale_warn() {
		return sale_warn;
	}

	public void setSale_warn(String sale_warn) {
		this.sale_warn = sale_warn;
	}

	public String getPurchase_warn() {
		return purchase_warn;
	}

	public void setPurchase_warn(String purchase_warn) {
		this.purchase_warn = purchase_warn;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCommercial_company_name() {
		return commercial_company_name;
	}

	public void setCommercial_company_name(String commercial_company_name) {
		this.commercial_company_name = commercial_company_name;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	
	public String GetDatabaseTableName() {
		// TODO Auto-generated method stub
		return "res_partner";
	}

	@Override
	public Object MapToModel(ResultSet resultSet) {
		// TODO Auto-generated method stub
		Clients clients = new Clients();
		
		try {
			clients.name = resultSet.getString("name");	
			clients.street=resultSet.getString("street");
			clients.city=resultSet.getString("city");
			clients.zip=resultSet.getString("zip");
			clients.phone=resultSet.getString("phone");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
		
	}

}

