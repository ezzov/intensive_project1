package dao.impl;

import dao.abstr.EmployeeDao;
import model.Customer;
import model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends AbstrDaoImpl<Employee, Long> implements EmployeeDao {
}
