package polimorhism;

public class Calculator {

	public void doAdd() {

	}

	public void doAdd(int a) {

		System.out.println("second add method");

	}

	public void doAdd(int a, int b) {
		int sum = a + b;

		System.out.println(" Additionof 2 number:" + sum);

	}

	public void doAdd(int a, int b, int c) {
		int sum = a + b + c;

		System.out.println(" Addition of 3 number:" + sum);

	}

	public void doAdd(int rc, double ab, int bc) {
		double sum = rc + ab + bc;

		System.out.println(" Addition of 3 number:" + sum);

	}

}
