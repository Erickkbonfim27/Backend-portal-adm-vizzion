package com.vizzion.portaladm.repositories;

import com.vizzion.portaladm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByCpf(String cpf);

}
