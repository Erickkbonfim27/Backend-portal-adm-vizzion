package com.vizzion.portaladm.entities.reports;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Report")
@Data
public class Report {

    @Id
    @Column(name = "id_Report")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Report;

    @Column(name = "id_Client")
    private long id_Client;
    @Column(name = "id_VizzionUser")
    private long id_VizzionUser;

    @Column(name = "id_LawReport")
    private long id_LawReport;
    @Column(name = "id_ViabilityAnalysis")
    private long id_ViabilityAnalysis;
    @Column(name = "id_HistoricAndProperty")
    private long id_HistoricAndProperty;
    @Column(name = "id_FloodAffectation")
    private long id_FloodAffectation;
    @Column(name = "id_NearbyPlaces")
    private long id_NearbyPlaces;
    @Column(name = "id_EmbedMaps")
    private long id_EmbedMaps;
    @Column(name = "id_Accessibility")
    private long id_Accessibility;
    @Column(name = "id_SocialCohesion")
    private long id_SocialCohesion;
    @Column(name = "id_AmbientalAnalisys")
    private long id_AmbientalAnalisys;

    @Column(name = "lastModification")
    private Date lastModification;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createdAt")
    private Date createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

}
