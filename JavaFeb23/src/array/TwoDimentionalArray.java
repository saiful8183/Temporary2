package array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		
		int[][]my2darray=new int[2][3];
		my2darray[0][0]=5;
		my2darray[0][1]=6;
		my2darray[0][2]=7;
		
		
		
		my2darray[1][0]=5;
		my2darray[1][1]=6;
		my2darray[1][2]=7;
		
		
		
		System.out.println(my2darray[1][1]);
		
		int lengthFirstarray=my2darray.length;
		int lengthsecondarray=my2darray[0].length;
		System.out.println("length of 2d array");
		System.out.println(lengthFirstarray);
		System.out.println(lengthFirstarray);
		
		System.out.println("Capturing all the value from 2d");
	
		for(int i=0;i<my2darray.length;i++);{
	for(int j=0;j<my2darray[0].length;j++){
	
	System.out.println(my2darray[j][j]);
	}
}
	}
}
