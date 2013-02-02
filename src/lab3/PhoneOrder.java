
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

    String phoneNotes; //any special comments taken by the account manager 
    int orderTypeID; //this would store order types such as cancellation, credit, normal

    public String getPhoneNotes() {
        return phoneNotes;
    }

    public void setPhoneNotes(String phoneNotes) {
        this.phoneNotes = phoneNotes;
    }

    public int getOrderTypeID() {
        return orderTypeID;
    }

    public void setOrderTypeID(int orderTypeID) {
        this.orderTypeID = orderTypeID;
    }
   
    
}
