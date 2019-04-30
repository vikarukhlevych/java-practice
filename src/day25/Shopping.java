package day25;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[]products= {"Timberland Shoes","H&M Shirt","Swatch watch","Gucci Bag","Adidas Socks"};
		
		double[]prices = {120.0,5.99,150.5,3000.5,6.99};
		
		
		int[]itemsId= {12345,12346,12347,12348,12349};
		
		
		//loop thru products and print each one in separate line
		
		
		System.out.println("Products count: "+products.length);
		
		//check if products prices and items Ids have same count
		if(prices.length==itemsId.length) {
			if(prices.length==products.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Something is wrong in this list");
			return;
		}
			
			for (String p:products) {
				System.out.println(p);
				
			}
			for (int i =0;i<prices.length;i++) {
				System.out.println(prices[i]);
			}
		}
		//itemsId in the reverse Order
		
		System.out.println("============");
		for (int i=itemsId.length-1;i>=0;i--) {
			System.out.println(itemsId[i]);
		
		}

		//print a report with total price
		
		
	System.out.println("###### YOUR SHOPPING RECEIPT #####");
	double totalPrice= 0.0;
		for (int i=0;i<products.length;i++) {
			System.out.println("Item "+i+": "+itemsId[i]+" - "+products[i]+" - $"+prices[i]);
		totalPrice+=prices[i];
		
		}
		
		System.out.println("Total Price: $"+totalPrice);
		
		//find the most expensive item in your list and print it
		
		int maxIndex=0;
		double maxPrice=0;
		
		for (int i=0;i<prices.length;i++){
		
		if(prices[i]>maxPrice) {
			maxPrice=prices[i];
			maxIndex=i;
		}
		}
		System.out.println("Max price: "+maxPrice);
		System.out.println("Item id of Max item "+ maxIndex);
		
		
		}
		
		
		
	

}
