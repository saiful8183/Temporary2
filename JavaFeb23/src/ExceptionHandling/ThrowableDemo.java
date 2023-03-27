package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowableDemo {

	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("Exception handling doesnot make any sence to me");
		Thread.sleep(3000);
	try {
  FileInputStream fis=new FileInputStream("");
	}catch(FileNotFoundException e){
		System.out.println("please check filrpath");
e.printStackTrace();

	}
	System.out.println("May be it is somthing ,not sure about the use of it");
}
}