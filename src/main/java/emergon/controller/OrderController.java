package emergon.controller;

import emergon.entity.BreadSize;
import emergon.entity.Ingredient;
import emergon.entity.Orders;
import emergon.entity.Payment;
import emergon.service.BreadSizeService;
import emergon.service.IngredientService;
import emergon.service.OrderService;
import emergon.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class OrderController {
    
    @Autowired
    private BreadSizeService breadService;
    @Autowired
    private IngredientService ingredientService;
    @Autowired
    private PaymentService paymentService;
    
    @Autowired
    private OrderService orderService;
    
    @ModelAttribute("sizes")
    public List<BreadSize> getSizes(){
        return breadService.findAll();
    }
    
    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredients(){
        return ingredientService.findAll();
    }
    
    @ModelAttribute("payments")
    public List<Payment> getPayments(){
        return paymentService.findAll();
    }
    
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String showHome(){
        return "home";
    }
    
    @GetMapping("/order")
    public String showOrderForm(Model model){
        Orders myOrder = new Orders();
        model.addAttribute("order", myOrder);
        return "order";
    }
    
    @PostMapping("/order")
    public String processOrder(@ModelAttribute("order") Orders order){
        Orders savedOrder = orderService.save(order);
        return "orderResult";
    }
    
}
