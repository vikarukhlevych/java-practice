package MyOwnPracticies;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double price = 0;
			String storageType, screenType, cpu, screenResolution = "";
			int ram = 0 ,memorySize=0;
			double screenSize =0.0;
			storageType="";
			
			Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE
	    
	    System.out.println("Select screen size:");
	    screenSize = scan.nextDouble();
	    if(screenSize==13.3){
	      price+= 200.0;
	    } else if (screenSize ==15.0){
	      price+=300;
	    } else if (screenSize == 17.3){
	      price+=400;
	    }
	    System.out.println("Select CPU type:");
	    cpu = scan.next();
	    if (cpu.equals("i3")) {
	    	price+=150;
	    } else if (cpu.equals("i5")) {
	    	price+=250;
	    }else if (cpu.equals("i7")) {
	    	price+=350;
	    }
	    System.out.println("Select RAM size:");
	    ram = scan.nextInt();
	    price+=ram*50;
	    System.out.println("Select storage type:");
	    storageType= scan.next();
	    if (storageType.equalsIgnoreCase("HDD")) {
	    	price+=(memorySize/500)*50;
	    } else if (storageType.equalsIgnoreCase("SDD")) {
	    	price+=(memorySize/500)*100;
	    }
	    System.out.println("Enter memory size:");
	    memorySize=scan.nextInt();
	    
	    System.out.println("Enter screen resolution:");
	    screenResolution=scan.next();
	    if (screenResolution.equalsIgnoreCase("FULLHD")) {
	    price +=100;
	   
	    } else if (screenResolution.equalsIgnoreCase("4K")) {
		    price +=200;
	    }
	    
	    
	    System.out.println("Laptop price is: $"+price);
	    
	    
	    
	    
	    
	    
	}

}
