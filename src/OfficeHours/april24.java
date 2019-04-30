package OfficeHours;

public class april24 {
	
	
	public static void main(String[] args) {
		
		String str = "jjavabook"; // we need to get vbk
		
		
		
		//outer loop will take 1 char at the time
		for(int i =0;i<str.length();i++) {
			//read one char from string str and store it to temp
			char temp = str.charAt(i);
			//System.out.println(str.charAt(i));
			
			
			
			//set count as 0 each time
			int count =0;
			//inner loop will help to compare with other chars
			for(int j =0;j<str.length();j++) {
				
				//compare each character with temp
				if(temp==str.charAt(j) && i !=j) {
					//System.out.println(temp+" is duplicated");
					
					//if it is match increase count by 1
					count++;
					break;
				}
			}
			
			
			//outside inner loop check if count is stil 0,
			//if count is still 0 then temp is unique
			if(count==0) {
				System.out.println(temp);
			}
		}
		
		
	}
	
	
	
	

}
