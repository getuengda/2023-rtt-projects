package coffeeshop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

	// this as a menu the coffee shop has to offer

	List<Product> products = new ArrayList<>();

	// this is the list of items in the order
	List<Product> order = new ArrayList<>();

	// this is a class member variable to take input from user
	Scanner input = new Scanner(System.in);

	/*
	 * for (Product product : products) can be read as
	 * "for each object of type Product in the list called products", so it goes
	 * thru each one and does whatever is inside the brackets following the for
	 * statement, in this case printing it
	 */

	public void setupProducts() {

		Product coffee = new Product();
		coffee.setName("Coffee");
		coffee.setPrice(5.66);
		products.add(coffee);

		Product tea = new Product();
		tea.setName("Tea");
		tea.setPrice(4.16);
		products.add(tea);

		Product cookie = new Product();
		cookie.setName("Cookie");
		cookie.setPrice(3.36);
		products.add(cookie);

		Product sandwich = new Product();
		sandwich.setName("Egg & Cheese Muffin");
		sandwich.setPrice(3.36);
		products.add(sandwich);

//		printProduct(coffee);
//		printProduct(tea);
//		printProduct(cookie);

		// printAllProducts();

	}

	public void printProduct(Product product) {
		// TODO HOMEWORK : Change this print only the product name + tab + price with a
		// $

		System.out.println("Product name :\t" + product.getName() + "" + "Price :\t" + product.getPrice());
	}

	public void printAllProducts() {
		for (Product product : products) {
			printProduct(product);
		}
	}

	public void example() {
		// value in each product is it's price
		float coffee = 4.75F;
		float cappuccino = 4.25F;
		float espresso = 3.99F;

		float subTotal = 0;

		/*
		 * complete an “order” for three items of the first product, four items of the
		 * second product, and two items of the third product
		 */

		// 3 items of the first product
		subTotal = coffee * 3;

		// 4 items of the second product
		subTotal = subTotal + (cappuccino * 4);

		// 2 items of the third product
		subTotal = subTotal + (espresso * 2);

		// Create two more variables called sub-total and totalSale

		DecimalFormat df = new DecimalFormat("$0.00");
		System.out.println("Total sale\t: " + df.format(subTotal));

		final float SALES_TAX = subTotal * 0.02F;
		System.out.println("Sales Tax\t: " + df.format(subTotal));

		float totalSale = subTotal + SALES_TAX;
		System.out.println("Total sale\t\t: " + df.format(totalSale));

	}

	public int displayMainUserMenu() {
		System.out.println("1) Print the menu items and price");
		System.out.println("2) Add an item to your order");
		System.out.println("3) Print items in your order");
		System.out.println("4) Checkout");
		System.out.println("5) Exit");

		System.out.println("What do you want to do? ");
		int select = input.nextInt();
		input.nextLine();

		return select;
	}

	public void userSelectProduct() {
		System.out.print("ENter product name to order: ");
		String orderSelection = input.nextLine();

		for (Product product : products) {
			if (product.getName().equalsIgnoreCase(orderSelection)) {
				order.add(product);
				System.out.println("Added " + product.getName() + " to your order.");
			}
		}
	}

	public static void main(String[] args) {

		CoffeeShop cf = new CoffeeShop();
		cf.setupProducts();

		while (true) {
			int userSelection = cf.displayMainUserMenu();

			if (userSelection == 1) {
				cf.printAllProducts();
			} else if (userSelection == 2) {
				cf.userSelectProduct();
			} else if (userSelection == 3) {
				// TODO HOMEWORK - display the products in the order list here
				cf.userSelectProduct();
			} else if (userSelection == 5) {
				System.exit(0);
			} else {
				System.out.println("User input " + userSelection + " is unknown. Try again");
			}

//		cf.printAllProducts();
		}

	}

}
