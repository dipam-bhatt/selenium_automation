package assignment1;
import org.testng.annotations.Test;

public class Q18food {
	        @Test(groups = "smoke")
            public void searchItem() {
            	         System.out.println("search item");
            }
	        @Test(groups = "order")
            public void addtoCart() {
            	        System.out.println("add to cart");
            }
	        @Test
            public void addLocation() {
            	         System.out.println("add location");
            }
}



