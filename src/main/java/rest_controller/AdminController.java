package rest_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.abstr.CustomerService;

@Controller
public class AdminController {

    private final CustomerService customerService;

    @Autowired
    public AdminController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers")
    public String getAllCustomers(Model model){
        model.addAttribute("customers", customerService.getAll());
        return "customers";
    }
}
