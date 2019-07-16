package com.pra.inheritance;

public class MsSQLConnection extends Connector {

	@Override
	public void openConnection() {
		
		System.out.println("MsSQLConnection open");
	}

	@Override
	public void closeConnection() {
		
		System.out.println("MsSQLConnection close");
	}

	@Override
	public void fireQuery() {
		
		System.out.println("MsSQLConnection fire Query");
	}
	
	

}
