package mk.ukim.finki.wp.model;

/**
 * Created by Mihajlovska on 26-Nov-17.
 */
public class Order {
    public String pizzaType;
    public String clientName;
    public String clientAddress;
    public long orderId;

    public Order(String pt,String cn,String ca,Long id){
        this.pizzaType = pt;
        this.clientName = cn;
        this.clientAddress = ca;
        this.orderId = id;
    }
}
