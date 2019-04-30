package day23;

public class PrintNumbersWithLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
//this is just to print numbers 1 to 10
		
		
		
		
		for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        for ( int i = 1; i <= 10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("**********    ************");
        //outer loop
        
        for ( int k = 1 ; k<=2; k++) {
            for (int j = 1; j <=2; j++) {
            //inner loop
            for ( int i = 1 ; i <=10; i++) {
                System.out.print(i+",");
            }
            System.out.println();
            }
            System.out.println("***************");
        }
		
	}	
}
