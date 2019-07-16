	package com.pra.inheritance;

public class MainRectangle {

	public static void main(String[] args) {
	
		Rectangle rec = new Rectangle(12, 13);
		//when we put object in sysout it is call method of object class.rec.tostring() method
		System.out.println(rec);
		System.out.println("The Rectangle instance member is Length ["+rec.len+"] Bredth ["+rec.bred+"]");
	
		Rectangle r1 = new Rectangle(10,10);
		Rectangle r2 = new Rectangle(10,11);
		
		 
		//check value 
		if(r1.equals(r2)){
		System.out.println("Equal");
		}else{
		System.out.println("Not equal");
		}
		//check References 
		if(r1 == r2){
			System.out.println("Equal");
			}else{
			System.out.println("Not equal");
			}
	
		
		Square s=new Square(2, 2);
		s.calAreaResult(2,2);
		
	}

}
