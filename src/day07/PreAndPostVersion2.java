package day07;

public class PreAndPostVersion2 {
	
	public static void main(String[] args) {
		
		int messages = 10;
		messages++; //11
		++messages; //12
		
		System.out.println("Messages: "+ messages);
		
		
		int readMessages = --messages;
		System.out.println("ReadMessages: "+ readMessages);
		System.out.println("Messages: "+ messages);
		
		
		
		int unreadMessages = readMessages--;
		
		System.out.println("unreadMessages: "+ unreadMessages);
		System.out.println("readMessages: "+ readMessages);
		
		int total = unreadMessages++ - readMessages--;
		System.out.println("unreadMessages: "+ unreadMessages); //
		System.out.println("readMessages: "+ readMessages);
		System.out.println("total: "+ total);
		
		
		int count = 20;
		int count2 = 10;
		int totalCount = ++count + --count2; //21+9=30
		System.out.println("count: "+count);//21
		System.out.println("count2: "+count2);//9
		
		System.out.println("totalCount: "+ totalCount);//30
		
		
		int myCount = count++ + ++count; //21+23=44
		System.out.println("myCount: "+myCount);
		
		
		
		
	}

}
