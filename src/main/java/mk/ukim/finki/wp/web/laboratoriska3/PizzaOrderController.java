package mk.ukim.finki.wp.web.laboratoriska3;

import mk.ukim.finki.wp.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

/**
 * Created by Mihajlovska on 26-Nov-17.
 */
@Controller
public class PizzaOrderController {
    private PizzaService ps;
    @Autowired
    public PizzaOrderController(PizzaService ps){
        this.ps=ps;
    }

    @RequestMapping(value="/pizza_index.html", method = RequestMethod.GET)
    public ModelAndView index(){

    }

}
