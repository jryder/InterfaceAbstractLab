
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * 
 * The more I thought about it, I think that the ECommerceOrder and the PhoneOrder
 * classes could just be different attributes of the main order class, but I'm not 
 * sure.  I think that these classes may be needed because of how they would have 
 * to tie into the rest of the transaction system.  They may have to have other 
 * behaviors that make them unique.
 * 
 * 
 * 
 */
public class StartUp {
    
    public static void main(String[] args) {
        
	PhoneOrder orderP = new PhoneOrder();
	orderP.setOrderNumber(12345);      

	ECommerceOrder orderE = new ECommerceOrder();
	orderE.setOrderNumber(234566);


	//set more properties for phone order
	orderE.setOnlineReferrer("Google");
	orderE.setChannelID(1);
	orderE.setOrderingContactID(443);
	orderE.setOrderingLocationID(664);
	orderE.setTotalSell(500);
	
	
	//add some products
	Product[] p = new Product[2];
	
	p[0] = new Product();
	p[0].setDescription("Mop");
	p[0].setQuantity(5);
	p[0].setUnitCost(30.00);
	p[0].setUnitSell(40.00);
	
	//add some products
	p[1] = new Product();
	p[1].setDescription("Broom");
	p[1].setQuantity(10);
	p[1].setUnitCost(5.00);
	p[1].setUnitSell(10.00);	
	
        
	System.out.println("Order " + orderE.getOrderNumber()  + " was placed");
	System.out.println("The purchaser was redirected from " + orderE.onlineReferrer );
	
	
	
    }
    
    
}
