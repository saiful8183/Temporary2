package array;

public class TwoDimentionalArray2 {

	public static void main(String[] args) {
		
		
		int[][]my2darray=new int[2][3];
		my2darray[0][0]=5;
		my2darray[0][1]=6;
		my2darray[0][2]=7;
		
		
		
		my2darray[1][0]=5;
		my2darray[1][1]=6;
		my2darray[1][2]=7;
		
		
		
		System.out.println(my2darray[1][1]);
		
		
		//Another way of declaring 2d array ,assigning value
	
		
		
		int [][]array2= {{4,56,83},{90,20,63}};
		
		int length=array2.length;
		int length2=array2[1].length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length2;j++) {
		
		System.out.println(array2[i][j]);
		
			}
		
		
			}	
		
		
	}
}