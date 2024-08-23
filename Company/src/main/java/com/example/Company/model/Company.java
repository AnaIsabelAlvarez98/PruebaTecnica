package com.example.Company.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;

    @Column(unique = true)
    private String codigoCompany;

    private String nameCompany;
    private String descriptionCompany;
}
