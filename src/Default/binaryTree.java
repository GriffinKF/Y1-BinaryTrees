package Default;

/**
 * The Binary Tree Class
 * @author Taha Kashaf (With significant portions of code taken from Baeldung and modified to fit for this assignment)
 *
 */
public class binaryTree {

	treeNode root;
	
	/**
	 * Constructor for the Binary Tree
	 */
	public binaryTree() {
		root = null;
	}
	
	/**
	 * The method that is called to add items to the tree.
	 * @param itemID The ID of the Item to be added
	 * @param itemName The Name of the Item to be added
	 * @param price The Price of the Item to be added.
	 */
	public void addToTree(int itemID, String itemName, double price) {
	    root = addSort(root, itemID, itemName, price);
	}
	
	/**
	 * The method that sorts through the tree and makes sure that nodes are placed in correct spots.
	 * @param current The current tree node (due to the recursive nature of the method)
	 * @param itemID The ID of the Item to be added
	 * @param itemName The Name of the Item to be added
	 * @param price The Price of the Item to be added.
	 * @return The current Node.
	 */
	private treeNode addSort(treeNode current, int itemID, String itemName, double price) {
	    if (current == null) {
	        return new treeNode(itemID, itemName, price);
	    }
	 
	    if (itemID < current.itemID) {
	        current.left = addSort(current.left, itemID, itemName, price);
	    } else if (itemID > current.itemID) {
	        current.right = addSort(current.right, itemID, itemName, price);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}
	
	/**
	 * The method that is called to search for something in the list.
	 * @param itemID The Item ID that is being searched for.
	 * @return True/False if the item is found or not.
	 */
	public boolean searchForID(int itemID) {
	    return containsNode(root, itemID);
	}

	/**
	 * The method that actually searches the tree for an item.
	 * @param current The current node (due to the recursive nature of the method)
	 * @param itemID The Item ID being searched for.
	 * @return True/False if the item is found or not.
	 */
	private boolean containsNode(treeNode current, int itemID) {
	    if (current == null) {
	    	System.out.println("There is no item with this ID in the Tree.");
	    	return false;
	    } 
	    if (itemID == current.itemID) {
	    	System.out.println("The item you're looking for has the following data:");
	    	System.out.println("Item ID: " + current.itemID);
	    	System.out.println("Item Name: " + current.itemName);
	    	System.out.println("Item Price: $" + current.price);
	        return true;
	    } 
	    return itemID < current.itemID
	      ? containsNode(current.left, itemID)
	      : containsNode(current.right, itemID);
	}
	
	/**
	 * The method that is called to delete an item from the Tree.
	 * @param itemID The Item ID which's node is being deleted.
	 */
	public void deleteItemID(int itemID) {
	    root = deleteSearch(root, itemID);
	}
	
	/**
	 * The method that handles the node deletion
	 * @param current The current node (due to the recursive nature of the method0
	 * @param itemID The Item ID being searched for to delete.
	 * @return The current node (due to the recursive nature of the method0
	 */
	private treeNode deleteSearch(treeNode current, int itemID) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (itemID == current.itemID) {
	    	//Delete code for a leaf
	    	if (current.left == null && current.right == null) {
	    	    return null;
	    	}
	    	//Delete code for node with one child
	    	if (current.right == null) {
	    	    return current.left;
	    	}
	    	 
	    	if (current.left == null) {
	    	    return current.right;
	    	}
	    	//Delete code for node with two children
	    	int smallestValue = findSmallestValue(current.right);
	    	current.itemID = smallestValue;
	    	current.right = deleteSearch(current.right, smallestValue);
	    	return current;
	    } 
	    if (itemID < current.itemID) {
	        current.left = deleteSearch(current.left, itemID);
	        return current;
	    }
	    current.right = deleteSearch(current.right, itemID);
	    return current;
	}
	
	/**
	 * A simple method that returns the smallest value node in the Tree.
	 * @param root Root.
	 * @return The value of the Item ID.
	 */
	private int findSmallestValue(treeNode root) {
	    return root.left == null ? root.itemID : findSmallestValue(root.left);
	}
	
	/**
	 * Prints the Tree in ascending order of the Item ID's
	 * @param node Always the root node.
	 */
	public void printInOrder(treeNode node) {
	    if (node != null) {
	        printInOrder(node.left);
	        System.out.println("Item ID: " + node.itemID + " Item Name: " + node.itemName + " Item Price: $" + node.price);
	        printInOrder(node.right);
	    }
	}
	
	
	double valueOfTree = 0;
	
	/**
	 * The method that calculates the value of the items in the Tree.
	 * @param node Required for the recursive nature of the method, is always called at first with the root node.
	 */
	public void sumOfTree(treeNode node) {
	    if (node != null) {
	        sumOfTree(node.left);
	        double currentVal = node.getNodePrice();
	        valueOfTree = valueOfTree + currentVal;
	        sumOfTree(node.right);
	    }
	}
	
	/**
	 * The method that is called to return the value of the items in the tree.
	 * @param node Root Node.
	 * @return The value of all the items in the tree.
	 */
	public double returnSum(treeNode node) {
		sumOfTree(node);
		return valueOfTree;
	}
	
}
