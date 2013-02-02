
package lab3;

import java.util.Date;

/**
 *
 * @author Jordan Ryder
 * 
 * This class identifies every instance of a transaction.  These could be sales
 * transactions, payment transactions, etc.  
 * 
 * The thought would be to have this class contain anything that could apply
 * to any transaction regardless of the type
 */
public class Transaction {
    private Date transactionDate;  //every transaction should have a date stamp?
    /** 
    * there could be many dates here.  The problem soon becomes that dates are 
    * specific to the type of occurance.  For example, financial data may have batch
    * date or PostToARDate.  Other transactions may not have this, so it's difficult
    * to define exactly should be here.  
    */
    
    
    //these are just to set a date, so the final rules can be stored here
    public final Date getTransactionDate() {
        return transactionDate;
    }

    public final void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
