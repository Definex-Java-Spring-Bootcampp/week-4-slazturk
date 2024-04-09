package com.patika.kredinbizdeservice.model;

import com.patika.kredinbizdeservice.enums.SectorType;
import com.patika.kredinbizdeservice.model.constant.CampaignEntityColumnConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Campaign {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = CampaignEntityColumnConstants.TITLE, unique = false, nullable = false)
    private String title;
    
    @Column(name = CampaignEntityColumnConstants.CONTENT, unique = false, nullable = false)
    private String content;
    
    @Column(name = CampaignEntityColumnConstants.DUE_DATE, unique = false, nullable = false)
    private LocalDate dueDate;
    
    @Column(name = CampaignEntityColumnConstants.CREATE_DATE, unique = false, nullable = false)
    private LocalDate createDate;
    
    @Column(name = CampaignEntityColumnConstants.UPDATE_DATE, unique = false, nullable = true)
    private LocalDate updateDate;
    
    @Column(name = CampaignEntityColumnConstants.SECTOR, unique = false, nullable = false)
    private SectorType sector;

}
