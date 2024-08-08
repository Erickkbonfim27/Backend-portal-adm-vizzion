package com.vizzion.portaladm.entities;

import com.vizzion.portaladm.enums.BusinessSize;
import com.vizzion.portaladm.enums.RealStateOrBuild;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "User")
public class User {

    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id_User;

    @Column(name="id_UserRole")
    private long Id_Role;

    @Column(name="id_Address")
    private long id_addres;

    @Column(name="id_RealState")
    private long id_RealState;

    @Column(name="id_constructionCompany")
    private long id_constructionCompany;

    @Column(name="FirstName")
    private  String FirstName;

    @Column(name="LastName")
    private String LastName;

    @Column(name="Age")
    private Integer Age;

    @Column(name="Ocupation")
    private String Ocupation;

    @Column(name="cpf")
    private String cpf;

    @Column(name = "RealStateOrBuild")
    @Enumerated(EnumType.STRING)
    private RealStateOrBuild RealStateOrBuild;

    @Column(name="HowMuchReportsHasBuyed")
    private Integer HowMuchReportsHasBuyed;

    @Column(name = "password")
    private String password;

    @Column(name = "WhatsappNumber")
    private String WhatsappNumber;

    @Column(name = "CellPhoneNumber")
    private String CellPhoneNumber;

    @Column(name = "Email")
    private String Email;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name="LastLogin")
    private Date lastLogin;

    @Column(name = "lastModification")
    private Date lastModification;


    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
