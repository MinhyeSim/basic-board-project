package com.basic.board.study.User.repositories;

import com.basic.board.study.User.domains.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//JPA를 사용하기 위해 상속함
//최상위 부모임. private final로 상속해주지 않음.
@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
    Optional<UserDAO> findByUsername(String username);
    //Optional<UserDTO> findAll(UserDTO userDTO);
    //새로운 메소드 ㅅㅇ성 
}
