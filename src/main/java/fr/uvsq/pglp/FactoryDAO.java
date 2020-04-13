package fr.uvsq.pglp;

import java.sql.Connection;

public class FactoryDAO{
	
	public static DAO<Personnels> PersonnelsDAO(Connection conn){
		return new PersonnelsDAO();
	}
	
	public static DAO<CompositePersonnels> getCompositePersonnels(Connection conn){
		return new CompositePersonnelsDAO();
	}


}