package com.pra.inheritance;

public class Cirlcle {
	
	final double pi=3.14;
	int r;
	double Area;
	public void calArea(int r) {
		
		//we can not change pi value here bcz pi is final value 
		//pi=12;
		Area=pi*r*r;
		System.out.println("Circle Area:"+Area);
		
	}
	public static void main(String[] args) {
		Cirlcle c=new Cirlcle();
		c.calArea(2);
		
	}

}
