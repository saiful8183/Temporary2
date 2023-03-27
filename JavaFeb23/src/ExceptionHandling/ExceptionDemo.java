package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		try {
		System.out.println("Let us figure out an exception");
		String[] name= {"ProSmart","Java","Selenium","Eclipse"};

		System.out.println(name[4]);
		
		//System.out.println("O my Good!!");  //Dead code
		
		
		
         }catch(Exception e){
        	 
        	System.err.println("Exception occured!"+ e.getMessage()); 
        	System.out.println("O my Good!! I could handle one");
         }
		System.out.println("I am out of the catch block");
         }

	}

