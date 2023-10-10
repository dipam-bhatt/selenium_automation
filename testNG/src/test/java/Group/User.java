package Group;

import org.testng.annotations.Test;

public class User {
	@Test
	public void register () {
		System.out.println("register user");
	}
	@Test(groups = "purchase")
	public void login () {
		System.out.println("login user");
	}
@Test (groups = "smoke")
public void profile () {
	System.out.println("profile user");
}
@Test (groups = "smoke")
public void logout () {
	System.out.println("user logout");
}

}
