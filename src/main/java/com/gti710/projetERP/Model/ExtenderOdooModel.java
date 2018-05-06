package com.gti710.projetERP.Model;

import java.sql.ResultSet;

public abstract class ExtenderOdooModel <T>{
	public abstract String GetDatabaseTableName();
	public abstract T MapToModel(ResultSet resultSet);
}
