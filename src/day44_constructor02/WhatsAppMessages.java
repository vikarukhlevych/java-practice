package day44_constructor02;

public class WhatsAppMessages {
	public static void main(String[] args) {
		WhatsApp wapp = new WhatsApp("703-333-4321", "Good for you!");
		//call third constructor that is chained
		WhatsApp wapp2 = new WhatsApp("347-689-1200");
	}
}
