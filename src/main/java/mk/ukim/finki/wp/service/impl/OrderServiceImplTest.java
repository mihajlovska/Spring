package mk.ukim.finki.wp.service.impl;

/**
 * Created by Mihajlovska on 26-Nov-17.
 */
import mk.ukim.finki.wp.model.Order;
import mk.ukim.finki.wp.service.OrderService;
import org.junit.After;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class OrderServiceImplTest {
    private OrderServiceImpl o;

    @Before
    public void setup(){
        o = new OrderServiceImpl();
    }
    @Test
    public Test test_placeOrder{
        String pType = new Order.pizzaType
    }

}
