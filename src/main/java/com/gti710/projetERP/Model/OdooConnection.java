package com.gti710.projetERP.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class OdooConnection {

	public Connection _dbConnection;
	
	public OdooConnection()
	{ 
		this._dbConnection = GetConnection();
		if(_dbConnection != null)  
		{
			  System.out.println("Connection etablie.");
		}
		else 
		{
			System.out.println("Connection non etablie.");
		}
	}
	
	
	private Connection GetConnection() 
	{	  
		try 
		{
			Class.forName("org.postgresql.Driver");	
			return DriverManager.getConnection("jdbc:postgresql://10.194.33.103/gti710-20173",
		                                    "pg_gti710","Gti710Pass03");
		} 
		catch (Exception se) 
		{	
			System.out.println("Impossible d'etablir la connection. Impression de la stacktrace et sortie "+ se);  
		} 
		return null;			
	}
}
