package inharitance;

public class  ConstructoeDemo {

	// Class veriables/Global veriables

	 String name;   //without get set method we can not make it private
     int rollNo;

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getRollNo() {
		return rollNo;
	}
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//	
	
	
	public ConstructoeDemo(String name,int rollNo) {
	
		this.name = name;
		this.rollNo = rollNo;
	System.out.println("Called");

}
}