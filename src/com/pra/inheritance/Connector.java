package com.pra.inheritance;

public abstract class Connector {
	
	//
	public abstract void openConnection();
	public abstract void closeConnection();
	public abstract void fireQuery();
	
	public  void display(){
		System.out.println("Disply connector");
	}
	public void loadedDBConnection(){
		System.out.println("Load db connector ");
		
		
	}


}
