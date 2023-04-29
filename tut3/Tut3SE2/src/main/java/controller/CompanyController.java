package controller;

import Service.CompanyService;
import Service.EmployeeService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/{id}")
    public String getCompanyById(@PathVariable Long id, Model model){
        model.addAttribute("company",companyService.getCompanyById(id));
        return "companyDetail";
    }

}
