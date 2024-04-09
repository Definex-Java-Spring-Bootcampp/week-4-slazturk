package com.patika.kredinbizdeservice.model;

import java.math.BigDecimal;

import com.patika.kredinbizdeservice.model.constant.LoanEntityColumnConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loan")

public abstract class Loan implements Product {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = LoanEntityColumnConstants.AMOUNT, unique = false, nullable = false)
    private BigDecimal amount;
	
	@Column(name = LoanEntityColumnConstants.INSTALLMENT, unique = false, nullable = false)
    private Integer installment;
	
	@ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
	
	@Column(name = LoanEntityColumnConstants.INTEREST_RATE, unique = false, nullable = false)
    private Double interestRate;
    // private Campaign campaign; // kampanyalı kredileri üstte çıkart

    //sponsorlu kampanyaları üstte çıkart

   
}
