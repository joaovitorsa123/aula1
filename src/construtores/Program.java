package construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.print("Product data: " + product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		product.totalValueInStock();
		
		System.out.println();
		System.out.print("Updated data:" + product.name + ", " + product.totalValueInStock() + ", " + product.quantity);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProdcuts(quantity);
		product.totalValueInStock();
		
		System.out.println();
		System.out.print("Updated data:" + product.name + ", " + product.totalValueInStock() + ", " + product.quantity);
		sc.close();
		
		
		
	}

}
