package Default;

/**
 * The Tree Node class
 * @author Taha Kashaf
 *
 */
public class treeNode {
	
	// The Data the node stores
	int itemID;
	String itemName;
	double price;
    treeNode left;
    treeNode right;
 
    /**
     * The basic node
     * @param itemID The ID the items are sorted by in the tree
     * @param itemName The name of the item
     * @param price The Price of the item
     */
    treeNode(int itemID, String itemName, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        right = null;
        left = null;
    }
	
    /**
     * A simple method that just returns the price of the item in the current node.
     * @return The Price, as a double.
     */
    public double getNodePrice() {
    	return price;
    }
	
	
}
