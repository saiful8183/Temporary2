package array;

public class Array_Demo {

	public static void main(String[] args) {
		//This is an one dimentional array
		//Declaring array
		String[] myArray=new String[3];
		
		
		
		//Assaigning value to the array
		//Assaigning value to the array
		myArray[0]="Selenium";
		myArray[1]="Eclipse";
		myArray[2]="java";
		
		System.out.println(myArray[1]);
		
		for(int i=0;i<myArray.length;i++){
		System.out.println(myArray[i]);
		
		
		}	
		
		//Another way of declaring the array
		
		int []number= {4,2,7};
		
		for(int i=0;i<number.length;i++){
			System.out.println(myArray[i]);
		
		
		}
		
		System.out.println("Exemple of enhanced for loop");
		//Enhanced for loop
		
		
		for(int v:number) {
			System.out.println(v);	
			
			
			
		}
		

	}

}
