package Application;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Scanner sc = new Scanner(System.in); 
		Locale.setDefault(Locale.US);
		
		System.out.println("Welcome System and Client production! ");

		System.out.println("Enter Cliente Data: ");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.nextLine(); sc.next();
		
	}

}
