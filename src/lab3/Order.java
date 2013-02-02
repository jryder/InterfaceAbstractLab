
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * This class will hold most of the information for what defines an order.  
 * 
 */
public abstract class Order extends Transaction implements Freight {
    int orderNumber;
    int orderingLocationID;
    int orderingContactID;
    double totalSell;
    Product[] products;
       
    
    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    public int getOrderingLocationID() {
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

    public void setOrderingLocationID(int orderingLocationID) {
        this.orderingLocationID = orderingLocationID;
    }

    //the remaining methods could have overrides.  Some of them may have things like validation, 
    //but also may not allow for an order to be placed online if it requires extra information over the phone.
    
    
    public int getOrderingContactID() {
        return orderingContactID;
    }

    public void setOrderingContactID(int orderingContactID) {
        this.orderingContactID = orderingContactID;
    }

    public Product[] getProducts() {
        return products;
    }

     public void setProducts(Product[] products) {
        this.products = products;
    }   
    
    //these can be final because they just set a dollar value in one variable
    public final double getTotalSell() {
        return totalSell;
    }

    public final void setTotalSell(double totalSell) {
        this.totalSell = totalSell;
    }


 
}
