package com.pra.inheritance;

public class MainConnector {

	public static void main(String[] args) {
		
		MsSQLConnection ms=new MsSQLConnection();
		ms.closeConnection();
		ms.openConnection();
		ms.fireQuery();
		OracleConnector oc=new OracleConnector();
		oc.closeConnection();
		oc.openConnection();
		oc.fireQuery();
		oc.display();

	}

}
