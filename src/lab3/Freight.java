
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * Orders will have to implement freight.  Freight is what will define what methods
 * are being used to deliver the product to the customer.  As the system expands, 
 * there will likely be additional methods added to this interface
 * 
 */
public interface Freight {
    
    public void calculateDeliveryDate(); //based on rules in the system, get the expected delivery date
    public void calculateShippingCharges(); //based on the rules in the system and what products are being ordered, calculate what the freight charges are
    
}


