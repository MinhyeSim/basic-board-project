package com.basic.board.study.User.services;


import com.basic.board.study.User.domains.Messenger;
import com.basic.board.study.User.domains.UserDAO;
import com.basic.board.study.User.domains.UserDTO;
import org.springframework.data.domain.Sort;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {

    //기능명세서(필요한 로직을 작성한다.)

    Messenger save(UserDTO userDTO);

    UserDTO login(UserDTO userDTO);

    Messenger logout(HttpServletRequest request);

    void partialUpdate(UserDTO userDTO);

    void delete(UserDTO userDTO) throws Exception;

    Messenger deleteAll();

    List<UserDAO> findAll();

    List<UserDAO> findAll(Sort sort);

    Messenger update(UserDAO userDAO);

}
