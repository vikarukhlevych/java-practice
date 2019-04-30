package OfficeHours;

public class april23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [] arr1= {5,78,1};
		
		int [] arr2 = {20,5,22,4,7};
		
		//check if all items in arr1 present in arr2(We need NESTED LOOP)
		
		
		//boolean containsAll=true;
		
		
		for(int n1:arr1) {
			System.out.println("OUTER: "+n1);
			int count=0;
			
			for(int n2:arr2) {
				//System.out.println("INNER: "+n2);
				if(n2==n1) {
					System.out.println("Found!!!"+n1+" is in ARR2!'");
					count++;
					break;
					
					
				}
			}
			
			if(count==0) {
				System.out.println("Did NOT Find!!!! " + n1+" is not in the Array");
			}
		}
		
	}

}
