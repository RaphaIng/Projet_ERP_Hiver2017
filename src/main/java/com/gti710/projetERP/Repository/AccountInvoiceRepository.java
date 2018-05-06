package com.gti710.projetERP.Repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.gti710.projetERP.Model.AccountInvoice;
import com.gti710.projetERP.Model.ExtenderOdooModel;
import com.gti710.projetERP.Model.SalesOrder;
public class AccountInvoiceRepository extends RepositoryBase<AccountInvoice> {
	
	public AccountInvoiceRepository(Connection connection)throws InstantiationException, IllegalAccessException {
		super(connection, AccountInvoice.class);
		// TODO Auto-generated constructor stub
	}
}

