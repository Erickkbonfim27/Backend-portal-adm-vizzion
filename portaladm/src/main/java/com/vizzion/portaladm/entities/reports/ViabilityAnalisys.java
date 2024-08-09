package com.vizzion.portaladm.entities.reports;

import jakarta.persistence.*;

@Entity
@Table(name = "ViabilityAnalisys")
public class ViabilityAnalisys {

    @Id
    @Column(name = "id_ViabilityAnalisys")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ViabilityAnalisys;


}
