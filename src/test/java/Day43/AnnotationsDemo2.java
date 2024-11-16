package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*1) Login --- @BeforeClass
2) Search --- @Test
3) Adv search   --- @Test
4) Logout  -- -AfterClass
*/

public class AnnotationsDemo2 {

	@BeforeClass
	void Login() {
		System.out.println("This is login.");
	}
	
	@Test(priority=1)
	void Search() {
		System.out.println("This is search...");
	}
	
	@Test(priority=2)
	void advSearch() {
		System.out.println("this is adavance search...");
	}
	
	@AfterClass
	void logout() {
		System.out.println("This is logout...");
	}
}
