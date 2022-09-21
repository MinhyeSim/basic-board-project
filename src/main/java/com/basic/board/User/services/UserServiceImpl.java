package com.basic.board.User.services;


import com.basic.board.User.domains.Messenger;
import com.basic.board.User.domains.UserDAO;
import com.basic.board.User.domains.UserDTO;
import com.basic.board.User.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
//1. 현재 부분이 Service임을 알려주는 어노테이션

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public Messenger save(UserDTO userDTO) {
        System.out.println("서비스로 전달된 회원가입 정보: "+userDTO.toString());
        String result = "";
        if(userRepository.findByUsername(userDTO.getUsername()).isEmpty()){
            userRepository.save(UserDAO.builder()
                    .username(userDTO.getUsername())
                    .nickname(userDTO.getNickname())
                    .email(userDTO.getEmail())
                    .password(userDTO.getPassword()).build());
            result = "사용가능한 아이디 입니다.";
        }else {
            result = "이미 등록된 아이디 입니다.";
        }
        return Messenger.builder().message(result).build();
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

    @Override
    public List<UserDAO> findAll(Sort sort) {
        return null;
    }

    @Override
    public Messenger update(UserDAO userDAO) {
        return null;
    }


}
