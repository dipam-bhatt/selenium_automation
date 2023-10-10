package Selenium.Selenium_learning;

import java.util.Scanner;

public class TheDPizza {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Welcome to D pizza");
		System.out.println("Small pizza-150, medium pizza-250, large pizza-350, monster pizza-500");
		System.out.println("Offers on "
				+ "Buy 4 small pizza & get 500 ml coke free");
		System.out.println("Buy 3 Medium pizza & get garlic bread");
		System.out.println("Buy 3 large pizza & get 500 ml coke+ garlic bread free");
		System.out.println("Buy 2 monster pizza and get 500ml coke+garlic bread + icecream");
				
				System.out.print("Enter the pizza size (small/medium/large/monster): ");
	            String pizzaSize = sc.next();
				
		System.out.println("Enter the quantity : ");
		int quantity = sc.nextInt();
		int pizzaPrice = 0;
	

		if (pizzaSize.equals("small")) {
           pizzaPrice = 150;
        } else if (pizzaSize.equals("medium")) {
             pizzaPrice = 250;
        } else if (pizzaSize.equals("large")) {
             pizzaPrice = 350;
        } else if (pizzaSize.equals("monster")) {
            pizzaPrice = 500;
        } else {
            System.out.println("Invalid pizza size.");
        }

		int totalCost = pizzaPrice * quantity;
        
        System.out.print("Do you want to order another pizza? (yes/no): ");
        String orderChoice = sc.next();
        
        System.out.println("your choice is "+orderChoice);
//        if (orderChoice.equals("no") || orderChoice.equals("n")) {
//        } else if (orderChoice.equals("yes") || orderChoice.equals("y")) {
//        } else {
//            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");

        System.out.println("Total Cost: Rs. " + totalCost);
        System.out.println("Thank you for your order!");

	
}
}

	
