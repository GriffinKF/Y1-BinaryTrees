package Default;

import java.awt.Choice;
import java.util.Scanner;

/**
 * Menu Class
 * @author Taha Kashaf
 *
 */
public class Menu {
	
    /**
     * Please don't write your test code directly in your main method!
     * Create an instance of your test class and then run various test methods.
     * @param args
     */
    public static void main(String args[])
    {
    	Menu mainMenu = new Menu();
    	mainMenu.displayMenu();
    	mainMenu.processUserChoices();
    }
	
	
	/**
     * A simple method that displays menu choices
     */
	public void displayMenu()
	{
	 System.out.println("Please select one of the options below (Enter a number 0-3)");
	 System.out.println("1. Add an item to the tree");
	 System.out.println("2. Print Tree in order of Item ID's");
	 System.out.println("3. Look up item");
	 System.out.println("4. Delete an item from the tree");
	 System.out.println("5. Calculate total value of Tree items.");
	 System.out.println("6. Enter Testing Menu");
	 System.out.println("0. Exit");
	}
	
	
	/**
     * A large method to deal with the choice the user inputs. A while loop is used both to repeat the menu until the user selects 	exit, and to repeat the menu if an invalid input in given.
     */
	public void processUserChoices()
	{
	
		int repeat = 0;
		String userChoice = "Default";
		binaryTree realTree = new binaryTree();
	
		while (repeat == 0) 
		{
			Scanner s = new Scanner(System.in);
			userChoice = s.nextLine();
			
			switch (userChoice)
			{
				case "1":
					System.out.println("You have selected to add an item to the tree");
					int tempItemID = validInt();
					System.out.println("Please enter the name of the item");
					String tempItemName = s.nextLine();
					double tempPrice = validDouble();
					realTree.addToTree(tempItemID, tempItemName, tempPrice);
					repeat = 0;
					displayMenu();
					break;		

				case "2":
					System.out.println("You have selected to print the Tree in order of Item ID's");
					System.out.println("Enter anything to continue");
					s.next();
					System.out.println("");
					realTree.printInOrder(realTree.root);
					repeat = 0;
					displayMenu();
					break;
					
				case "3":
					System.out.println("You have selected to look up an item in the tree.");
					System.out.println("Enter the item ID for the item you wish to look up");
					realTree.searchForID(validInt());
					repeat = 0;
					displayMenu();
					break;

				case "4":
					System.out.println("You have selected to delete an item in the tree.");
					System.out.println("Enter the item ID for the item you wish to delete");
					realTree.deleteItemID(validInt());
					repeat = 0;
					displayMenu();
					break;

				case "5":
					System.out.println("You have selected to view the total value of the items in the tree");
					System.out.println("");
					System.out.println(realTree.returnSum(realTree.root));
					repeat = 0;
					displayMenu();
					break;


				case "6":
					System.out.println("You have chosen to Enter the testing menu, enter anything to continue.");
					s.next();
					testing Tests = new testing();
					Tests.runTestMenu();
					repeat = 0;
					displayMenu();
					break;

				case "0":
					repeat = 1;
					break;

				default:
					System.out.println("That is not a valid selection, please enter a valid option from the displayed Menu");
					displayMenu();
					repeat = 0;
					break;
			}    
		
		}
	
	}
	
	/**
	 * A method that validates integer input
	 * @return The valid user input.
	 */
	public int validInt() {
		
		int userChoice;
		Scanner s = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Please enter the item ID Number (Must be an integer greater than or equal to 1)");
		do {
		    while (!s.hasNextInt()) {
		        System.out.println("That is not a valid input, enter a WHOLE NUMBER greater than 1");
		        s.next();
		    }
		    userChoice = s.nextInt();
		    while (userChoice < 1) {
		    	System.out.println("That is not a valid input, enter an number greater than or equal to 1");
		    	while (!s.hasNextInt()) {
			        System.out.println("That is not a valid input, enter a NUMBER greater than or equal to 1");
			        s.next();
			    }
		    userChoice = s.nextInt();
		    }	    
		} while (userChoice < 1);

		return userChoice;
	}
	
	/**
	 * A method that validates what the user might choose for a price
	 * @return The valid price
	 */
	public double validDouble() {
		
		double userChoice;
		Scanner s = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Please enter the item cost (Must in the form '3.50')");
		do {
		    while (!s.hasNextDouble()) {
		        System.out.println("That is not a valid input, enter a cost (Must in the form '3.50')");
		        s.next();
		    }
		    userChoice = s.nextDouble();
		    while (userChoice < 0) {
		    	System.out.println("That is not a valid input, cost (Must in the form '3.50')");
		    	while (!s.hasNextDouble()) {
			        System.out.println("That is not a valid input, cost (Must in the form '3.50')");
			        s.next();
			    }
		    userChoice = s.nextDouble();
		    }	    
		} while (userChoice < 0);

		return userChoice;
	}
}