package ActionItems;

public class AddingNUmbers {

	public static void main(String[] args) {

		/*
		 * int sum=0; for(int i=0;i<=15;i++) { sum=sum+ i; }
		 * System.out.println("Sum is :"+ sum);
		 */

//		int sum1=0;
//		int i=0;
//		while(i<=15)
//		{
//			
//		sum1=sum1+i;
//		i++;
//			
//		}
//		System.out.println("Sum is :"+ sum1);
//		
//		
//		
		
		//Adding even number 20 - 40

		int sum = 0;
		for (int i = 20; i <= 40; i++)

		{
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("The sum of 20 odd numbers are:" + sum);

	}

}
