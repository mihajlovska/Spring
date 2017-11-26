package mk.ukim.finki.wp.service;

import mk.ukim.finki.wp.model.Order;

import java.util.Random;


/**
 * Created by Mihajlovska on 26-Nov-17.
 */
public interface OrderService {
    public Order  placeOrder(String pizzaType, String clientName, String address);


}
