package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.OrderStatus;
import Entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Welcome A");
		System.out.println("Enter cliente date: ");
		System.out.print("Name: ");
		String name = sc.nextLine(); 
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		// instanciação! 
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		System.out.println("Enter order Data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); // aqui converte o string para receber o status! 
		
		Order order = new Order(new Date(), status, client); 
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt(); 
		for(int i = 0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product Name: ");
			sc.nextLine();
			String productName = sc.nextLine(); 
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt(); 
			
			Product product = new Product(productName, productPrice); 
			OrderItem it = new OrderItem(quantity, productPrice, product); 
			order.addItem(it); 
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
	}

}
