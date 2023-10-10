package assignment1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

// 11.  W.a.junit program to handled Assert class with all method to check its pass or fail
public class Q11 {
	        @Test
            public void PassFail() {
            	      //  assertEquals("Dip", "Dip" );
            	        assertEquals("Dip", "Dip");
            	        assertTrue (true); 
            	        int i[] = {10,20,30,40,50};
            	        int j[] = {10,20,30};
            	        assertArrayEquals(i, j);
            }
}




