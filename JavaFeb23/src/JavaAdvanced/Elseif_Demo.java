package JavaAdvanced;

public class Elseif_Demo {

	public static void main(String[] args) {
	
		
	/*
	 * 
	 * 
	 * if(condition)
	 * { code to be executed
	 * }else if(condition)
	 * 
	 * {
	 * Code to be executed
	 * }else
	 * {
	 * code to be executed
	 * }
	 * 
	 * 	
	 */
		
		
		int age =200;
		
		if (age>=18 && age<=80) {
		
		System.out.println("It is high time to get married");
		
		}else if(age>80 && age >=129)
		{
		System.out.println("Pray to god that you are in goog health");
		}
		else
		{
			System.out.println("You are too young !! \nwait fo a while"); // back slash n (\n) means ,it will give results in two separate lin.
		}

	}

}
