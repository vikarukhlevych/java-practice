package day27;

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*/Java --> programming language
Selenium --> Test Automation
TestNG --> Unit Tests
JUnit --> Unit Tests
Cucumber --> BDD Style testing
Git --> Version control
Maven --> Building and execution for project
		 */
		
		
		
		String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};
		
		
		//for(int i =0;i<tools.length;i++){
			//if(tools[i]=="Java") {
				//System.out.println("Programming language");
			//}
		//}
		
		
		
		for(String tool:tools) {
			switch(tool.toLowerCase()) {
			case "java":
				System.out.println("Programming language");
				break;
			case "selenium":
				System.out.println("Test Automation");
				break;
			case "testng":
				System.out.println("Unit Tests");
				break;
			case "junit":
				System.out.println("Unit Tests");
				break;
			case "cucumber":
				System.out.println("BDD Style testing");
				break;
			case "git":
				System.out.println("Version control");
				break;
			case "maven":
				System.out.println("Building and execution for project");
				break;
				default:
					System.out.println("Not such a tool");
					break;
		
		}
		
		
		}
	}

}
