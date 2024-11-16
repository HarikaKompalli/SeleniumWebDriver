package Day43Pack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle() 
	{
		String exp_title ="openCart";
		String acc_title ="openShop";
		/*
		if(exp_title.equals(acc_title)) {
			System.out.println("Test pass...");
		}else {
			System.out.println("Test Fail...");
		}*/
		
//		Assert.assertEquals(exp_title, acc_title);
		
		if(exp_title.equals(acc_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		} 
				
	}
}
