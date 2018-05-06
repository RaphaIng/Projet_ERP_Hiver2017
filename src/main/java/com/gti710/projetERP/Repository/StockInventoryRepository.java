package com.gti710.projetERP.Repository;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.gti710.projetERP.Model.ExtenderOdooModel;
import com.gti710.projetERP.Model.SalesOrder;
import com.gti710.projetERP.Model.SalesOrderLine;
import com.gti710.projetERP.Model.StockInventory;
import com.gti710.projetERP.Model.StockInventoryLine;
public class StockInventoryRepository extends RepositoryBase<StockInventory> {
	
	public StockInventoryRepository(Connection connection)throws InstantiationException, IllegalAccessException {
		super(connection, StockInventory.class);
		// TODO Auto-generated constructor stub
	}
}

