package com.vizzion.portaladm.dtos;

import com.vizzion.portaladm.enums.RealStateOrBuild;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class createNewUserDto {

    private Integer Id_Role;
    private  String FirstName;
    private String LastName;
    private Integer Age;
    private String Ocupation;
    private String cpf;
    private Integer id_addres;
    private RealStateOrBuild RealStateOrBuild;
    private String password;
    private String WhatsappNumber;
    private String CellPhoneNumber;
    private String Email;
    private String PhoneNumber;
}
