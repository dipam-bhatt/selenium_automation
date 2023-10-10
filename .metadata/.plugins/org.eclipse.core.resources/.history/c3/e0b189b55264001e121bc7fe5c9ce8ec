package Selenium.Selenium_learning;

import java.util.Scanner;

public class dpizza {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Pizza menu : ");
     	 System.out.println("Small - 150");
     	 System.out.println("Medium - 250");
     	 System.out.println("Large - 350");
     	 System.out.println("Monster - 500");
     	 System.out.println("Offers on pizza : ");
     	 System.out.println("Buy 4 small size pizza get 500 ml coke free");
     	 System.out.println("Buy 3 medium size pizza get 1 garlic bread free");
     	 System.out.println("Buy 3 large pizza get 500ml coke+garlic bread free");
     	 System.out.println("Buy 2 monster pizza get 500ml coke+garlic bread+icecream free"); 
	     System.out.println("Enter size of pizza : ");
	     String size = sc.next(); 
	     System.out.println("Enter quantity of pizza : ");
	     int q = sc.nextInt();

	     if (size.equals("small") && q>=4) {
	    	 int c = 0;
	    	 for (int n=4;n<=q;n+=4) {
	    		 if(q % n == 0) {
	    		 }
	    		 if(n>0) {
   				 c++;
   			 }
	    	 }
	    	 System.out.println("Offer applied " + c + " times : ");
	    	 System.out.println("Your total bill amount is : " +(q*150));
		   }
	     else {
	    	 System.out.println("Sorry ! offer not applied");
	    	 System.out.println("Your total bill amount is : " +(q*150));
	     }
		 if (size.equals("medium") && q>=3) {
			 int c = 0;
	    	 for (int n=3;n<=q;n+=3) {
	    		 if(q % n == 0) {
	    		 }
	    		 if(n>0) {
   				 c++;
   			 }
	    	 }
	    	 System.out.println("Offer applied " + c + " times : ");
	    	 System.out.println("Your total bill amount is : " +(q*250));
		   }		
		 else {
	    	 System.out.println("Sorry ! offer not applied");
	    	 System.out.println("Your total bill amount is : " +(q*250));
	     }
		  if (size.equals("large") && q>=3) {
			  int c = 0;
		    	 for (int n=3;n<=q;n+=3) {
		    		 if(q % n == 0) {
		    		 }
		    		 if(n>0) {
	    				 c++;
	    			 }
		    	 }
		    	 System.out.println("Offer applied " + c + " times : ");
		    	 System.out.println("Your total bill amount is : " +(q*350));
			   } 			
		  else {
		    	 System.out.println("Sorry ! offer not applied");
		    	 System.out.println("Your total bill amount is : " +(q*350));
		     }
		   if (size.equals("monster") && q>=2) {
			   int c = 0;
		    	 for (int n=2;n<=q;n+=2) {
		    		 if(q % n == 0) {
		    		 }
		    		 if(n>0) {
	    				 c++;
	    			 }
		    	 }
		    	 System.out.println("Offer applied " + c + " times : ");
		    	 System.out.println("Your total bill amount is : " +(q*500));
			   }	
		   else {
		    	 System.out.println("Sorry ! offer not applied");
		    	 System.out.println("Your total bill amount is : " +(q*500));
		     }
	   }

}
