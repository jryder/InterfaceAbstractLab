
package lab3;

/**
 *
 * @author Jordan Ryder
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
	Product[] p = new Product[100];
	p[1].setDescription("Mop");
	p[1].setQuantity(5);
	p[1].setUnitCost(30.00);
	p[1].setUnitSell(40.00);
	
	//add some products
	p[2].setDescription("Broom");
	p[2].setQuantity(10);
	p[2].setUnitCost(5.00);
	p[2].setUnitSell(10.00);	
	
        
	
	
	
	
    }
    
    
}
