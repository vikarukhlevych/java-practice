package day47_blocks;
//static import
import static day47_blocks.BriteERP.*;
import static day47_blocks.BriteERP.enterEmail;
public class BriteERPLoginTest {
	public static void main(String[] args) {
		//call static methods. ClassName.methodName
		/*
		 * BriteERP.enterEmail();
		   BriteERP.enterPassword();
		   BriteERP.verifyLogin();
		 */
		enterEmail();
		enterPassword();
		verifyLogin();
	}
}
