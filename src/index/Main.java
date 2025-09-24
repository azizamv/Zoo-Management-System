package index;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		new Main();
	}
	
	
	public Main() {
		int input;
		ArrayList<Animal> zooList = new ArrayList<>();
		
		do {
			System.out.println("\n=== Zoo Management Menu ===");
			System.out.println("1. Create Animal");
			System.out.println("2. View All Animals");
			System.out.println("3. Delete Animal");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			input = scan.nextInt();
			
			int choose;
			String name;
			
			switch (input) {
			case 1:
				System.out.println("\n=== Create Animal ===");
				System.out.println("1. Lion");
				System.out.println("2. Fish");
				System.out.println("3. Bird");
				System.out.print("Choose an animal to create (Enter number, or 0 to go back): ");
				choose = scan.nextInt();
				if (choose == 0) break;
				scan.nextLine();
				
				System.out.print("Enter the name of the animal: ");
				name = scan.nextLine();
				
				// add new animal to list
				switch (choose) {
				case 1:
					zooList.add(new Lion(name));
					break;
				case 2:
					zooList.add(new Fish(name));
					break;
				case 3:
					zooList.add(new Bird(name));
					break;
				default:
					break;
				}
				System.out.println(name + " has been added to the zoo.");
				
				break;
			case 2:
				int choice;
				System.out.println("\n=== Animals in the Zoo ===");
				
				// print zooList
				for (int i = 0; i < zooList.size(); i++) {
					System.out.printf("%d. %s\n", i+1, zooList.get(i).getName());
				}
				
				System.out.print("Choose an animal to interact with (Enter number, or 0 to go back): ");
				choice = scan.nextInt();
				if (choice == 0) break;
				scan.nextLine();
				Animal selectedAnimal;
				selectedAnimal = zooList.get(choice-1);
				
				System.out.println("Interacting with " + selectedAnimal.getName());
				// interact
				((act)selectedAnimal).interact();
				
				break;
			case 3:
				int choices;
				System.out.println("\n=== Delete Animal ===");
				// print list animal
				System.out.print("Choose an animal to delete (Enter number, or 0 to go back): ");
				choices = scan.nextInt();
				if (choices == 0) break;
				scan.nextLine();
				
				// remove animal
				zooList.remove(choices);
				System.out.println(" has been removed from the zoo");
			default:
				break;
			}
			
		} while (input != 4);
		
	}

}
