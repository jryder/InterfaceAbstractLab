
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * This class is the same as the regular order except that it stores attributes
 * of an order placed on the phone.  
 * 
 */
public class PhoneOrder extends Order{

    //These properties are specific to the PhoneOrder class.  The orderTypeID could possibly be put on the suer class,
    //but there may be different values or behaviors for online orders
    String phoneNotes; //any special comments taken by the account manager 
    int orderTypeID; //this would store order types such as cancellation, credit, normal

   
    //no need to override
    public final String getPhoneNotes() {
        return phoneNotes;
    }

    //possibly could be overridden with validation
    public void setPhoneNotes(String phoneNotes) {
        this.phoneNotes = phoneNotes;
    }

    //no need to override
    public final int getOrderTypeID() {
        return orderTypeID;
    }

    
    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }
   
    
}
