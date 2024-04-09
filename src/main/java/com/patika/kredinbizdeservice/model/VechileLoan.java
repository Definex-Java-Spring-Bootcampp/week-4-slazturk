package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.LoanType;

import com.patika.kredinbizdeservice.enums.VechileStatuType;

import jakarta.persistence.Entity;
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
@Table(name = "vechile_loan")
public class VechileLoan extends Loan {

    private LoanType loanType = LoanType.ARAC_KREDISI;
    private VechileStatuType vechileStatuType;

}
