
package lab3;

/**
 *
 * @author Jordan Ryder
 * 
 * For orders placed online, this stores attributes of those orders.  These orders
 * could be originated from different channels if third parties are being used
 * 
 */
public class ECommerceOrder extends Order {
    String onlineReferrer; //if there was a redirect from another website
    int channelID; //what online channel was used

    public String getOnlineReferrer() {
        return onlineReferrer;
    }

    public void setOnlineReferrer(String onlineReferrer) {
        this.onlineReferrer = onlineReferrer;
    }

    public int getChannelID() {
        return channelID;
    }

    public void setChannelID(int channelID) {
        this.channelID = channelID;
    }
    
}
