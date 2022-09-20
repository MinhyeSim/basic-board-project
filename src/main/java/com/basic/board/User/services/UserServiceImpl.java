package com.basic.board.User.services;


import com.basic.board.User.domains.Messenger;
import com.basic.board.User.domains.UserDAO;
import com.basic.board.User.domains.UserDTO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<UserDAO> save(UserDTO userDTO) {
        return null;
    }

    @Override
    public Messenger login(UserDTO userDTO) {
        return null;
    }

    @Override
    public Messenger logout(HttpServletRequest request) {
        return null;
    }

    @Override
    public void partialUpdate(UserDTO userDTO) {
        
    }

    @Override
    public void delete(UserDTO userDTO) {

    }

    @Override
    public Messenger deleteAll() {
        return null;
    }

    @Override
    public List<UserDAO> findAll() {
        return null;
    }


}
