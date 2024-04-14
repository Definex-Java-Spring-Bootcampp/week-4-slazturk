package com.patika.kredinbizdeservice.model;

import java.util.List;

import com.patika.kredinbizdeservice.model.constant.BankEntityColumnConstants;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "bank")

public class Bank {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = BankEntityColumnConstants.NAME, unique = false, nullable = false)
    private String name;
	
	@OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<Loan> loanList;
	
	@OneToMany(mappedBy = "bank", cascade = CascadeType.ALL)
    private List<CreditCard> creditCards;
}
