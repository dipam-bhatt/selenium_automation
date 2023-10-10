package assignment1;
import org.testng.annotations.Test;

//18. W.a. TestNG program to create group with testing.xml file

public class Q18user {	       @Test(groups = "smoke")
        public void register() {
     	           System.out.println("register user");
        }
	       @Test
        public void login() {
        			   System.out.println("login user");
        }
	       @Test
        public void profile() {
        	 		   System.out.println("profile user");
        }
	       @Test
        public void logout() {
        			   System.out.println("logout user");
        }
}

