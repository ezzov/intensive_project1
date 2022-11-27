package service.impl;

import dao.abstr.EmployeeDao;
import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends AbstrServiceImpl<Employee, Long> {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        super(employeeDao);
        this.employeeDao = employeeDao;
    }
}
