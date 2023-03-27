package encapsulation;

public class Bank {

	int accNumber = 12345678;
	private int pinNumber = 1234;
	private int balance = 150000;

	public void drawMony(int acNo, int pinNo, int amount) {

		if (acNo == accNumber && pinNo == pinNumber) {

			if (amount <= balance) {

				balance = balance - amount;

				System.out.println(amount + "Amount withdrawn: Current Balanve is" + balance);

			} else {
				System.out.println("Insufficient mony");

			}
		} else {

			System.out.println("Invalid credential");

		}

	}

	public void updatepin(int accountNo, int oldPin, int newPin) {

		if (accountNo == accNumber && oldPin == pinNumber) {
			pinNumber = newPin;
			System.out.println("Pin is updated !You are secured");

		} else {
			System.out.println("Invalid credential !");
		}
	}
}
