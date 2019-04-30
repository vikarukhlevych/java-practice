package CodingBad;

public class String2 {
	
		
		
		
		public String lastChars(String a, String b) {
			  if(a.length()!=0 && b.length()!=0){
			    return "a.substring(0,1)+b.substring(b.length())";
			  } else if (a.length()==0){
			    return "@ +b.substring(b.length())";
			  } else if (b.length()==0){
			    return "a.substring(0,1)+@";
			  }
			  }
			
}