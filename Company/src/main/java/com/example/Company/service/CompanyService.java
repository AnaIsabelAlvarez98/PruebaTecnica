package com.example.Company.service;

import com.example.Company.model.Company;
import com.example.Company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }

    public List<Company> getAllCompanies(){
        return companyRepository.findAll();
    }

    public Optional<Company> getCompanyById(Long id){
        return companyRepository.findById(id);
    }

    public Company updateCompany(Long id, Company companyDetails){
        Company company = companyRepository.findById(id).orElse(null);
        if (company !=null){
            company.setCodigoCompany(companyDetails.getCodigoCompany());
            company.setNameCompany(companyDetails.getNameCompany());
            company.setDescriptionCompany(companyDetails.getDescriptionCompany());
        return companyRepository.save(company);
        }
        return null;
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }

    public Company getCompanyByCodigo(String codigoCompany){
        return companyRepository.findByCodigoCompany(codigoCompany);
    }
}
