package com.gti710.projetERP.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gti710.projetERP.Model.ExtenderOdooModel;

public class RepositoryBase <T extends ExtenderOdooModel> implements IRepository<T>{
	protected Connection _dbConnection;
	private ResultSet  _resultSet;
	private String _query;
	private T _clazz;

	public RepositoryBase(Connection connection, Class<T> clazz) throws InstantiationException, IllegalAccessException
	{
		this._dbConnection = connection;
		this._clazz = clazz.newInstance();
	}

	public List<T> GetAll() {
		List<T> ts = new ArrayList();
		try {
			_query = "select * from "+ _clazz.GetDatabaseTableName();		
			Statement stmt = _dbConnection.createStatement();
			_resultSet = stmt.executeQuery(_query);	
			 while (_resultSet.next()) {
		            ts.add((T) _clazz.MapToModel(_resultSet));
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// TODO Auto-generated method stub
		return ts;
	}


}
