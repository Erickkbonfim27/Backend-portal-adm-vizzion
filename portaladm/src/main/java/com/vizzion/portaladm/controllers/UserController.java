package com.vizzion.portaladm.controllers;

import com.vizzion.portaladm.dtos.createNewUserDto;
import com.vizzion.portaladm.entities.User;
import com.vizzion.portaladm.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createNewUser(@RequestBody createNewUserDto dto) {
        if (dto == null || dto.getFirstName().isEmpty() || dto.getLastName().isEmpty() || dto.getPassword().isEmpty()) {
            return ResponseEntity.badRequest().body("todos os dados são necessários");
        }
        User savedUser = userService.saveNewUser(dto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId_User())
                .toUri();

        return ResponseEntity.created(location).body(savedUser);

    }

}
