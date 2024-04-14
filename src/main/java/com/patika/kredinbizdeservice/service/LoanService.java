package com.patika.kredinbizdeservice.service;
import com.patika.kredinbizdeservice.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    private LoanRepository loanRepository;
    @Autowired
    public LoanService(LoanRepository loanRepository) {
        super();
        this.loanRepository = loanRepository;
    }

}
