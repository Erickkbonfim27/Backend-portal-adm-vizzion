package com.vizzion.portaladm.services;

import com.vizzion.portaladm.dtos.createNewUserDto;
import com.vizzion.portaladm.entities.User;
import com.vizzion.portaladm.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    ModelMapper modelMapper = new ModelMapper();

    public User saveNewUser(createNewUserDto dto){
        User userAlreadyExists = userRepository.findUserByCpf(dto.getCpf());
        if (userAlreadyExists != null){
            throw new IllegalArgumentException("Usuario ja existente");
        }
        if(!dto.getPassword().isEmpty()){
            String salt = BCrypt.gensalt(11);
            System.out.println(dto.getPassword());
            String hashedPassword = BCrypt.hashpw(dto.getPassword(), salt);
            dto.setPassword(hashedPassword);
            System.out.println(dto.getPassword());
        }

        //gera o token e retorna

        User userSaved = userRepository.save(modelMapper.map(dto, User.class));
        System.out.println(userSaved);
        return userSaved;
    }

}
