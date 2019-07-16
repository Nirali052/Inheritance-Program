package com.pra.inheritance;

public class OracleConnector extends Connector{

	@Override
	public void openConnection() {
		System.out.println("Open connection");
		
		
	}

	@Override
	public void closeConnection() {
		
		System.out.println("Close the connection");
	}

	@Override
	public void fireQuery() {
		
		System.out.println("fire Qurey about database");
		
		
	}

}
