package ActionItems;

//Q4. Write a program that sums all the even numbers from 20 to 40
//using for and while loop

public class Sum {

	public static void main(String[] args) {

		dosum();

	}

	public static void dosum() {

		int start = 20, end = 40, sum = 0;

		while (start <= end) {

			if (start % 2 == 0) {

				sum += start;

			}
			start++;

		}

		System.out.println("The result is:" + sum);
	}

}
