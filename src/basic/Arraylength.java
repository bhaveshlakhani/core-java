package basic;

public class Arraylength {
	
	public static void main(String[] args) 
	{
		 
		 int[] arr1=new int[5];// 1D array
		 
		 int[][] arr2=new int[3][4]; // 2D array
		
		
		 int[][][] arr3= new int[2][3][5]; // 3d Array
		 
		 
		 // 1D array
		 System.out.println("array length of 1d array= "+arr1.length);
		 
		 // 2 D array
		 System.out.println("2 d  array length="+arr2.length);//number of row
		 System.out.println("in 2 d array number of column="+arr2[1].length);
		 
		 // 3 D array
		 
		 System.out.println("3d array length="+arr3.length);
		 System.out.println("3d array length="+arr3[0].length);
		 System.out.println("3d array length="+arr3[1].length);
		 
		 
		 // 3d array declaration
		 int[][] foo = new int[][] {
			        new int[] { 1, 2, 3 },
			         new int[] { 1, 2, 3, 4},
			    };

			    System.out.println(foo.length); //2
			    System.out.println(foo[0].length); //3
			    System.out.println(foo[1].length); //4
		 
		 
		 
		 
		 
		 
		 
		 
		  
	}
	

	  

}
