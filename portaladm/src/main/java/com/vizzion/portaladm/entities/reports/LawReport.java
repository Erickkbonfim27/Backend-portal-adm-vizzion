package com.vizzion.portaladm.entities.reports;

import jakarta.persistence.*;

@Entity
@Table(name = "Reports_law")
public class LawReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_LawReport")
    private long id_LawReport;


    //definir todos os dados da analise jurídica do report

}
