package basic;

import org.testng.annotations.Test;

public class P2_Priority {
	@Test(priority = 3)
	public void logout() {
		System.out.println("logout test");
	}
	@Test(priority = 1)
	public void createaccount() {
		System.out.println("create account test");
	}
	@Test(priority = 2, expectedExceptions = Exception.class)
	public void login() {
		System.out.println("login test");
		int j =10;
		int k = j/0;
		System.out.println(k);
	}
	@Test(priority = 4)
	public void azudio() {
		System.out.println("azudio test");
	}
	

	

}
