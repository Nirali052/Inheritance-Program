package com.pra.inheritance;

public class Square	extends Rectangle {
	
	public Square(int len, int bred) {
		super(len, bred);
		
	}

	@Override
	public void  calAreaResult(int len,int bred){
		//super();
		Area=len*bred;
		System.out.println("Squre area:"+Area);
	}

	
	public void Display() {
		System.out.println("This Squre method display");
	}
}
