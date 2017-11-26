package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by Mihajlovska on 26-Nov-17.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order placeOrder(String pizzaType, String clientName, String address){
        Random r =new Random();
        Long value = r.nextLong();
        Order order = new Order(pizzaType,clientName,address,value);
        return order;
    }

}
