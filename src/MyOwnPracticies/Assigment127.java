package MyOwnPracticies;

import java.util.Scanner;

public class Assigment127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner inp = new Scanner(System.in);
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++)
	    {
	      for(int j=0 ;j<=cols-1;j++)
	      {
	        arr[i][j]=inp.nextInt();
	      }//end for cols
	    }//end for rows
	    
	    
	    //TODO write your code below
		int max=0;
	    for(int i =0;i<arr.length;i++){
	      for(int j =0;j<arr.length;j++){
	        if(arr[i][j].length()>max){
	        	
	          max=arr[i][j].length();
	       
	        }
	        
	      }
	    }
	    
	    System.out.println(arr[max]);
	    
	   
	  }//end main
	}

	
