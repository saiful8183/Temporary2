package polimorhism;

public class WebstarBank extends CentralBank {

	public static void main(String[] args) {

		// object of webstar class
		WebstarBank web = new WebstarBank();
		System.out.println("The interest rate is :" + web.homeloanInterest());

	}

//This is overriding method
//	public double homeloanInterest() {
//
//		return 5.25;
//
//	}

}
