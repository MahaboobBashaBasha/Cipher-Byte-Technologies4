package mahaboob.com23CipherbyteTechnologies;

import java.util.*;

public class DigitalLibraryManagementSystem {
	public static void main(String[] args) {
		Library library = new Library();
		Admin admin = new Admin(library);
		User1 user = new User1(library);
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nWelcome to Digital Library Management System");
			System.out.println("1. Admin Module");
			System.out.println("2. User Module");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\nAdmin Module:");
				admin.addBook(3, "Design Patterns", "Eric Gamma");
				break;
			case 2:
				System.out.println("\nUser Module:");
				user.browseBooks();
				break;
			case 3:
				System.out.println("Exiting Digital Library Management System. Goodbye!");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}


