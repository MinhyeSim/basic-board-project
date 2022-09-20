package com.basic.board.User.repositories;

import com.basic.board.User.domains.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA를 사용하기 위해 상속함
public interface UserRepository extends JpaRepository<UserDAO, Long> {
}
