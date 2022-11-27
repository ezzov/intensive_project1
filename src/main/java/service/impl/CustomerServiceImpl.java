package service.impl;

import dao.abstr.AbstrDao;
import dao.abstr.CustomerDao;
import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl extends AbstrServiceImpl<Customer, Long> {

    private CustomerDao customerDao;

    @Autowired
    public CustomerServiceImpl(CustomerDao customerDao) {
        super(customerDao);
        this.customerDao = customerDao;
    }
}
