
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
    private String description;
    
    
    public final int getQuantity() {
	return quantity;
    }

    //depending on the circumstance, it may be necessary to make sure there is 
    //not a negative quantity, so allow for an override
    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    //should not need to be overridden
    public final double getUnitCost() {
	return unitCost;
    }
    
    //This may need to be overriden to prevent negative values
    public void setUnitCost(double unitCost) {
	this.unitCost = unitCost;
    }

    //should not need to overridden
    public final double getUnitSell() {
	return unitSell;
    }

    //could possibly be overridden to prevent negative values
    public void setUnitSell(double unitSell) {
	this.unitSell = unitSell;
    }

  
    //does not need to be overridden
    public String getDescription() {
	return description;
    }

    
   //could be overridden to validate string length so it doesn't fail being loaded to the database   
    public void setDescription(String description) {
	this.description = description;
    }

}
