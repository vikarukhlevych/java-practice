package day49_inheritance02;
    //Factory is a NON-Subclass that is in same package
public class Factory {
	public static void main(String[] args) {
		Device dv = new Device();
		dv.brand = "LG";
		dv.model = "3300";
		dv.price = 1000;
		//dv.country = "USA";not visible
		
	}
}
