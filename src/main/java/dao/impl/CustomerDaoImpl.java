package dao.impl;

import dao.abstr.CustomerDao;
import model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl extends AbstrDaoImpl<Customer, Long> implements CustomerDao {
}
