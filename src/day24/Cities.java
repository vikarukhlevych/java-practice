package day24;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] cities = {"Wachington DC", "Kiev", "Annandale","Istanbul","Moscow","Baku","Miami","Silver Spring","McLean"};
		
		System.out.println(cities.length);
		
		//pring all cities that starts with M
		
		
		for (int i=0;i<cities.length;i++) {
		if(cities[i].startsWith("M")) {
			System.out.println(cities[i]);
		}
	}

		for(String city: cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			
		}
		
		
		
		
		}
}
}