package com.patika.kredinbizdeservice.model;


import com.patika.kredinbizdeservice.enums.LoanType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "consumer_loan")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ConsumerLoan extends Loan {
    @Enumerated(EnumType.STRING)
    private LoanType loanType = LoanType.IHTIYAC_KREDISI;

    @ElementCollection
    @CollectionTable(name = "installment_options", joinColumns = @JoinColumn(name = "consumer_loan_id"))
    @Column(name = "installment_option")
    private List<Integer> installmentOptions;
}
