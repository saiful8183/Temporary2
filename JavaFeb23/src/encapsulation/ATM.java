package encapsulation;

public class ATM {

	public static void main(String[] args) {
		
	
	Bank obj=new Bank();
	//obj.pinNumber=6754;
	obj.drawMony(12345678,1234,1000);
	obj.updatepin(12345678,1234 ,6754);
	
}
}