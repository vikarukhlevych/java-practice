package MyOwnPracticies;

public class Assigment151 {
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String numStr = scan.next();
	    printDataTypes(numStr);
	  }
	  
	  public static void printDataTypes(String numStr){
	    long num = 0;
	    try{
	       num = Long.valueOf(numStr);
	       System.out.println(num+" can be fitted in:");
	       if(num>=-128 && num<=127){
	            System.out.println("* byte");
	       }
	        //WRITE YOUR CODE HERE
	        if(num>=-32768 && num<=32767){
	          System.out.println("* byte < short");
	        } else if(num>=-2147483648 && num<=2147483647){
	          System.out.println("* byte < short < int");
	        }else if((num%1!=0 && num>=-1.4E-45 && num>=-3.4028235E+38)||(num%1!=0 && num>=1.4E-45 && num>=3.4028235E+38)){
	          System.out.println("* float");
	        }else if(num>=-9223372036854775808&&num<=9223372036854775807){
	          System.out.println("* byte < short < int < long");
	        } else if((num%1!=0 && num>=-4.9E-324 && num<=-1.7976931348623157E+308)||(num%1!=0 && num>=4.9E-324 && num<=1.7976931348623157E+308))
	        System.out.println("* double");
	        
	        
	        
	        
	        
	        
	        
	        //DO NOT CHANGE        
	    }catch(Exception e){
	       System.out.println(numStr+" can't be fitted anywhere.");
	    }
	  }
	
}
