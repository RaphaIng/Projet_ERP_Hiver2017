package com.gti710.projetERP.Repository;

import java.util.List;

public interface IRepository <T> {
		
	//T Get(int id);
	List<T> GetAll();
		

}
