import java.util.Scanner;

/*
 * Rahul Shah
 * PD 7 Amberg
 * 3/21/16
 * Driver class for the Binary Search Tree
 * 
 * Create a driver for your binary search tree that allows me to input strings that will be stored in the BST until I wish to stop. I will indicate end of input by typing n to a prompt.
 You should then allow me to choose from the following menu options:
 1.	Traverse inorder
 2.	Traverse postorder
 3.	Traverse preorder
 4.	Remove an element
 5.	Add an element
 6.	Exit
 * 
 */
public class BinarySearchTreeDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinarySearchTree tree = new BinarySearchTree();
		// ask for input until user inputs 'n'
		boolean isDone = false;
		do {
			System.out.println("Enter a string, or n to stop: ");
			String input = scan.nextLine();
			if (!input.equals("n"))
				tree.insert(input);
			else
				isDone = true;
		} while (!isDone);

		System.out.println("BST created!");

		// output menu options
		int choice = 0;
		while (choice != 6) {
			System.out
					.println("\nWhat do you want to do with the Binary Search Tree?: ");
			System.out
					.println("1. Traverse inorder\n2. Traverse postorder\n3. Traverse preorder\n4. Remove an element\n5. Add an element\n6. Exit");
			choice = scan.nextInt();

			// menu options
			switch (choice) {
			case 1:
				tree.inorder();
				break;
			case 2:
				tree.postorder();
				break;

			case 3:
				tree.preorder();
				break;
			case 4:
				System.out.print("Enter item to be removed:");
				tree.remove(scan.next());
				break;
			case 5:
				System.out.print("Enter an item to be added: ");
				tree.insert(scan.next());
				break;
			default:
				System.out.println("Exiting...");
			}// end of switch

		}// end of while loop
	}// end of main
}// end of BinarySearchTreeDrive
