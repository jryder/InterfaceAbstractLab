
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * This class stores an array of products within an order.  Any attributes of the 
 * products will be stored in this class.  This class does not extend or implement
 * anything, but I thought it would be good to add this to the project.  
 * 
 */
public class Product {
    
    //these are pretty straightforward, all attributes of products.  These will be specific to every order
    private int quantity;
    private double unitCost;
    private double unitSell;

    public int getQuantity() {
	return quantity;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    public double getUnitCost() {
	return unitCost;
    }

    public void setUnitCost(double unitCost) {
	this.unitCost = unitCost;
    }

    public double getUnitSell() {
	return unitSell;
    }

    public void setUnitSell(double unitSell) {
	this.unitSell = unitSell;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }
    private String description;
}
