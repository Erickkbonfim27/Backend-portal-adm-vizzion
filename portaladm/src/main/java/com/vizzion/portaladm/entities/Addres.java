package com.vizzion.portaladm.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Addres")
@Data
public class Addres {

    @Id
    @Column(name = "id_address")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_address;

    @Column(name = "id_user")
    private long id_user;

    @Column(name = "Road")
    private String Road;

    @Column(name = "Number")
    private String Number;

    @Column(name = "GeoCordinade")
    private String GeoCordinade;

    @Column(name = "City")
    private String City;

    @Column(name = "Estado")
    private String Estado;

    @Column(name = "Country")
    private String Country;

    @Column(name = "lastModification")
    private Date lastModification;
}
