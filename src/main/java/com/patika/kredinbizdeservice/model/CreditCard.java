package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.model.constant.CreditCardEntityColumnConstants;
import com.patika.kredinbizdeservice.model.constant.UserEntityColumnConstants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credit_card")
public class CreditCard implements Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = CreditCardEntityColumnConstants.FEE, unique = false, nullable = false)
    private BigDecimal fee;

    @OneToMany(mappedBy = "credit_card", cascade = CascadeType.ALL)
    private List<Campaign> campaignList;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
}
