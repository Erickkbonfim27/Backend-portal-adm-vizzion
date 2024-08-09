package com.vizzion.portaladm.entities;

import com.vizzion.portaladm.enums.BusinessSize;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "RealState")
public class RealState {

    @Id
    @Column(name = "id_Realstate")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_RealState;

    @Column(name = "id_userCreator")
    private long id_userCreator;

    @Column(name="Address")
    private long id_addres;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name = "businessSize")
    @Enumerated(EnumType.STRING)
    private BusinessSize businessSize;

    @Column(name="HowMuchReportsHasBuyed")
    private Integer HowMuchReportsHasBuyed;

    @Column(name="lastBuy")
    private Date lastBuy;

    @Column(name = "WhatsappNumber")
    private String WhatsappNumber;

    @Column(name = "CellPhoneNumber")
    private String CellPhoneNumber;

    @Column(name = "Email")
    private String Email;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name = "lastModification")
    private Date lastModification;

}
