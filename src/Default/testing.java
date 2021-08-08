package Default;

import java.util.Scanner;

/**
 * Tester Class.
 * @author Taha Kashaf
 *
 */
public class testing {

	/**
	 * Menu letting you choose which test to run
	 */
	public void runTestMenu()
    {
        String choice;
        boolean exit=false;
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.println("Test Menu");
            System.out.println("A - Test 1");
            System.out.println("B - Test 2");
            System.out.println("C - Test 3");
            System.out.println("D - Test 4");
            System.out.println("E - Test 5");
            System.out.println("F - Test 6");
            System.out.println("G - Test 7");
            System.out.println("H - Test 8");
            //System.out.println("I - Test 8");
            System.out.println("Q - quit");        
            
            
            
            choice= s.next();
        
            switch (choice)
            {
                case "A":
            		System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("This test does not have any results, check the debug menu to see if numbers were added to tree correctly. However, the lack of error message is good.");
            		System.out.println("");
                	test1();
                	System.out.println("");
                	break;
                case "B":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 2 Results:");
            		System.out.println("");
                	test2();
                	System.out.println("");
                	break;
                case "C":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 3 Results:");
            		System.out.println("");
                	test3();
                	System.out.println("");
                	break;
                case "D":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 4 Results:");
            		System.out.println("");
                	test4();
            		System.out.println("");
                	break;
                case "E":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 5 Results:");
            		System.out.println("");
                	test5();
            		System.out.println("");
                	break;
                case "F":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 6 Results:");
            		System.out.println("");
                	test6();
            		System.out.println("");
                	break;
                case "G":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 7 Results:");
            		System.out.println("");
                	test7();
                	System.out.println("");
                	break;
                case "H":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 8 Results:");
            		System.out.println("");
                	test8();
            		System.out.println("");
                	break;
                //case "I":
                	//System.out.println("Details of the tests can be found in program documentation");
            		//System.out.println("Test 9 Results:");
            		//System.out.println("");
                	//test9();
            		//System.out.println("");
                	//break;
                case "Q":
                	System.out.println("Goodbye\n");
                      exit=true;
                        break;
                default: System.out.println("That is not a valid choice, please try again");
                        break;         
            }
        } while (!exit);
    }

	
	/**
	 * First test simply adds a series of items to the tree
	 */
	public void test1() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		
	}
	
	/**
	 * The second test adds a bunch of items to the tree, then prints the tree in ascending order of item ID.
	 */
	public void test2() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.printInOrder(Tree.root);
	}
	
	/**
	 * The third test searches for an item in the tree by its Item ID
	 */
	public void test3() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.searchForID(7);
		
	}
	
	/**
	 * The fourth test searches for an item in the tree that isn't there.
	 */
	public void test4() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.searchForID(9);
	}
	
	/**
	 * The fifth test deletes a leaf of the tree
	 */
	public void test5() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(5, "Red Pen", 2.00);
		Tree.addToTree(4, "Pen", 1.50);
		Tree.addToTree(6, "Note Book", 5.00);
		Tree.addToTree(3, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.deleteItemID(1);
		Tree.printInOrder(Tree.root);
	}
	
	/**
	 * The sixth test deletes a node with 2 children.
	 */
	public void test6() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.deleteItemID(14);
		Tree.printInOrder(Tree.root);
	}
	
	/**
	 * The seventh test deletes a node with 1 child.
	 */
	public void test7() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 2.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		Tree.deleteItemID(2);
		Tree.printInOrder(Tree.root);
	}
	
	/*
	 * The eighth test calculates the total value of the tree. 
	 */
	public void test8() {
		binaryTree Tree = new binaryTree();
		Tree.addToTree(10, "Red Pen", 44.00);
		Tree.addToTree(14, "Pen", 1.50);
		Tree.addToTree(18, "Note Book", 5.00);
		Tree.addToTree(11, "Calculator", 15.00);
		Tree.addToTree(7, "Lab Book", 5.50);
		Tree.addToTree(2, "Eraser", 1.00);
		Tree.addToTree(8, "Sharpie", 2.20);
		Tree.addToTree(1, "Pencil", 1.00);
		System.out.print(Tree.returnSum(Tree.root));
	}
}
