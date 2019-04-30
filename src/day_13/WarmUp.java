package day_13;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int carType;
		carType = 0;
		double avaragePrice;
		String carOptions,carOrigin;
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car you are interesten in?");
		System.out.println("1)American\n2)Japanese\n3)German\n4)Italian\n5)Korean");
		carType = scan.nextInt();
		
		
		switch(carType){
		
		case 1:
			carOrigin = "American";
			avaragePrice = 33000;
			carOptions = "Ford, Dodge, Tesla, Chevrolet,Lincoln"; 
			break;
		case 2:
			carOrigin = "Japanese";
			avaragePrice = 32000;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			break;
		case 3:
			carOrigin = "German";
			avaragePrice = 55000;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche"	;
			break;
			
		case 4:
			carOrigin = "Italian";
			avaragePrice =85000;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			break;
		case 5:
			carOrigin = "Korean";
			avaragePrice = 25000;
			carOptions = "Kia, Hyundai, Daewoo";
			break;
			default:	
				System.out.println("Car type not available"); 
				return; // stop execution
		}
		
		System.out.println("You selected " + carOrigin + " car and your car options are "+ carOptions);
		System.out.println("Avarage Price: "+ avaragePrice);
		
		//OR YOU CAN DO THIS WAY,LONGER WAY
		
		if (carType ==1) {
			System.out.println("You selected American car and your options are Ford, Dodge, Tesla, Chevrolet, Lincoln.\"\n" + 
					"\"Average Price: 33000\"");
		} else if(carType == 2) {
			System.out.println("You selected Japanese car and your options are Toyota, Mitsubisi, Honda, Subaru, Mazda.\"\n" + 
					"\"Average Price: 32000\"");
		} else if(carType==3) {
			System.out.println("You selected German car and your options are Bmw, VW, Audi, Mercedes, Porsche.\"\n" + 
					"\"Average Price: 55000\"");
		} else if(carType == 4) {
			System.out.println("You selected Italian car and your options are Alfa Romeo, Ferrari, Lamborghini, Fiat.\"\n" + 
					"\"Average Price: 85000\"");
		} else if (carType ==5) {
			System.out.println("You selected Korean car and your options are Kia, Hyundai, Daewoo.\"\n" + 
					"\"Average Price: 25000\"");
		}
	}

}
