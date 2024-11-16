package Day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	/*
	 1) Open app
	 2) Login
	 3) Logout
	  
	 */
	
	//priority order //        -4 -5 -3 -2 -1  0 1 2 3 4 5
	@Test(priority=1)
	void openApp() {
		System.out.println("application opened...");
	}
	
	@Test(priority=3)
	void LogOut() {
		System.out.println("application logout....");
	}
	
	@Test(priority=2)
	void Login() {
		System.out.println("application loggedin....");
	}

}
