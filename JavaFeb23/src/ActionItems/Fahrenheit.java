package ActionItems;

//08. Write a method that accepts Celsius temperature as argument.

//The method should return Fahrenheit temperature after converting
//Celsius into Fahrenheit.
//
//[Formula F=(C x 9/5) + 32]

public class Fahrenheit {

	public static void main(String[] args) {

		System.out.println("Fahrenheit temperature:" + convertCelcius(33));

	}

	public static double convertCelcius(int celcius) {   //can change data type

		double fahrenheit = (celcius  *9 / 5) + 32;

		return fahrenheit;

	}

}
