
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * This class will hold most of the information for what defines an order.  
 * 
 */
public abstract class Order extends Transaction implements Freight {
    
    //these are the basic properties of an order.  I think these are placed correctly.
    //Technically some of them could go on the subclass level, but I think this is better because in this transaction system, all orders will have products.
    int orderNumber;
    int orderingLocationID;
    int orderingContactID;
    double totalSell;
    Product[] products;
       
    
    //no need to override
    public final int getOrderNumber() {
        return orderNumber;
    }

    //this could be overridden with validation
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    //no need to override
    public final int getOrderingLocationID() {
        return orderingLocationID;
    }

    //final, because the freight rules will not be different based on the way the order was placed
    public final void calculateDeliveryDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //final, because the freight rules will not be different based on the way the order was placed
    public final void calculateShippingCharges() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //I don't see a need to override this, the application should be passing a valid value in
    public final void setOrderingLocationID(int orderingLocationID) {
        this.orderingLocationID = orderingLocationID;
    }

    //the remaining methods could have overrides.  Some of them may have things like validation, 
    //but also may not allow for an order to be placed online if it requires extra information over the phone.
    
    //no need to override
    public final int getOrderingContactID() {
        return orderingContactID;
    }

    //may use validation
    public void setOrderingContactID(int orderingContactID) {
        this.orderingContactID = orderingContactID;
    }

    //just returns the array
    public final Product[] getProducts() {
        return products;
    }

    //possibly would have validation.  In fact, there would likely be a lot more methods to modify what is in the product list
     public void setProducts(Product[] products) {
        this.products = products;
    }   
    
    //these can be final because they just set a dollar value in one variable
    public final double getTotalSell() {
        return totalSell;
    }

    //no need to override, just a number
    public final void setTotalSell(double totalSell) {
        this.totalSell = totalSell;
    }


 
}
