package com.pra.inheritance;

public class Rectangle {
	int len, bred;
	int Area;

	//method 
	
	public Rectangle(int len,int bred) {
		this.bred=bred;
		this.len=len;
		
	}
	public void  calAreaResult(int len,int bred){
	
		Area=2*(len+bred);
		System.out.println("Rectangle area:"+Area);
	}
	
}
