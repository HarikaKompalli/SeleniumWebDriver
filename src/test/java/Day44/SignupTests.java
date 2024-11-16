package Day44;

import org.testng.annotations.Test;

public class SignupTests {

	@Test(priority=1,groups= {"regression"})
	void signupbyemail()
	{
		System.out.println("this is signup by email....");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupbyFacebook()
	{
		System.out.println("this is signup by Facebook....");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupbyTwitter()
	{
		System.out.println("this is signup by Twitter....");
	}
}
