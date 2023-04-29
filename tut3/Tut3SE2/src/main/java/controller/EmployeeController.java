package controller;

import Service.CompanyService;
import Service.EmployeeService;
import entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    CompanyService companyService;
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employee",employeeService.getAllEmployees());
        return "employees";
    }
    @GetMapping(value = "{id}")
    public String getEmployeeById(@PathVariable Long id, Model model){
        model.addAttribute("employee",employeeService.getEmployeeById(id));
        return "employeeDetail";
    }
}
