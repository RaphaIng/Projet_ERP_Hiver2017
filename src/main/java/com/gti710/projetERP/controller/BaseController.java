package com.gti710.projetERP.controller;

import com.gti710.projetERP.Model.OdooConnection;
import com.gti710.projetERP.Repository.RepositoryFactory;

public class BaseController {
	
	protected OdooConnection _OdooConnection;
	protected RepositoryFactory _repositoryFactory;
	
	public BaseController()
	{
		this._OdooConnection = new OdooConnection();
		this._repositoryFactory = new RepositoryFactory(this._OdooConnection);
	}
}
