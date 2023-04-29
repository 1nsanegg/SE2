package Service;

import entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {
    private CompanyRepository companyRepository;
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public List<Company> getCompanyById(Long id) {
        return companyRepository.findAll();
    }
}
