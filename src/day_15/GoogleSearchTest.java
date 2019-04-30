package day_15;

public class GoogleSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item = "java";
		String pageTitle = item + " - Google Seaerch" ;
		
		//	test if pageTitle starts with item
		
		if (pageTitle.startsWith(item)) {
			System.out.println("Page title check passes");
		} else {
			System.out.println("Fail : Page title check failed");
		}
		if (pageTitle.endsWith("Google Seaerch")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
	}

}
