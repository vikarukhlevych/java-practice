package MyOwnPracticies;

import java.util.Scanner;

public class Assigment136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    int result1= 0;
	    int result2= 0;
	    for(int i =0;i<matrix.length;i++){
	      for(int j=0;j<matrix[i].length;j++){
	        result1+= matrix[0][j];
	      }
	    }
System.out.println(result1);
	}

}
