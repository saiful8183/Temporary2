package inharitance;

public class Huskey extends Dog { // If huskey wents Inharit from animal ,have to comment out dog sound

	public static void main(String[] args) {

		Huskey obj = new Huskey();

		obj.sound();

	}

	public void sound() {

		System.out.println("Oofff");
	}

}
