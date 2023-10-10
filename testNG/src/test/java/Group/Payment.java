package Group;

import org.testng.annotations.Test;

public class Payment {
	@Test (groups ="smoke")
	public void COD() {
		System.out.println("COD test");
	}
	@Test
	public void debitcard() {
		System.out.println("debit test");
	}@Test
	public void Creditcard() {
		System.out.println("credit test");
	}
	@Test(groups = "purchase")
	public void UPI() {
		System.out.println("UPI test");
	}
}
