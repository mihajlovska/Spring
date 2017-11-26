package mk.ukim.finki.wp.service.impl;

import mk.ukim.finki.wp.service.PizzaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihajlovska on 26-Nov-17.
 */
@Service
public class PizzaServiceImpl implements PizzaService {
    @Override
    public List<String> getPizzaTypes(){
        List lista = new ArrayList<>();
        lista.add("Small");
        lista.add("Medium");
        lista.add("Large");
        return lista;
    }

}
