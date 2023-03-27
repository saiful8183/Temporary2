package MethodDemo;

import MethodDemo.Calculator;

public class TestCalculator {
	
	
	public void gogsound() {
		sound();
		
		System.out.println("I am naking dog sound ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//object of calculator class
	Calculator cal=new Calculator();
		
		
	 System.out.println("Addition of a and b is :"+cal.doAdd(25, 12));
	
	
	 System.out.println("Subtraction of a and b is :"+cal.dosub(25, 12));
	 
	System.out.println( cal.concatString("Hello", "I am Manha"));
	
	
	TestCalculator obj=new TestCalculator();
	System.out.println(obj.doMul(54, 95));
	System.out.println(dodiv(34,7));
	obj.sound();
	obj.gogsound();
	System.out.println(Calculator.d03Mul(4, 722, 67));
	}
	
	
	public int doMul(int a,int b) {
		
		int c=a*b;
		
		return c;

	
		
		
		}
	
	public static int dodiv(int a,int b) {
		
		int c=a/b;
		return c;

		
		
		
		
	}
	public void sound() {
		
		System.out.println("This is the generic sound");
	}
	
	

	
}
