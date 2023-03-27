package inharitance;

public class Test implements InterfaceDEmo {

	public static void main(String[] args) {
	
//		
//		Test obj =new Test();
//		obj.makeSound();

		
		ConstructoeDemo obj3 =new ConstructoeDemo("Masud",1);
		
		//obj3.setName("Masud");
		System.out.println(obj3.getName());
		System.out.println(obj3.getRollNo());
	}


	public void makeSound() {
	
		System.out.println("Please sing a sweet song");
		
	}

}
