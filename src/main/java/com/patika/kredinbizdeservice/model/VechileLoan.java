package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.LoanType;

import com.patika.kredinbizdeservice.enums.VechileStatuType;

import jakarta.persistence.*;
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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class VechileLoan extends Loan {
    @Enumerated(EnumType.STRING)
    private LoanType loanType = LoanType.ARAC_KREDISI;

    @Enumerated(EnumType.STRING)
    @Column(name = "vechile_statu_type")
    private VechileStatuType vechileStatuType;

}
