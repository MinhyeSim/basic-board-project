package com.basic.board.User.services;


import com.basic.board.User.domains.Messenger;
import com.basic.board.User.domains.UserDAO;
import com.basic.board.User.domains.UserDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {

    //기능명세서(필요한 로직을 작성한다.)

    List<UserDAO> save(UserDTO userDTO);

    Messenger login(UserDTO userDTO);

    Messenger logout(HttpServletRequest request);

    void partialUpdate(UserDTO userDTO);

    void delete(UserDTO userDTO);

    Messenger deleteAll();

    List<UserDAO> findAll();
}
