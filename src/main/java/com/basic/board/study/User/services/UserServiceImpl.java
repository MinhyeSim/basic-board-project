package com.basic.board.study.User.services;


import com.basic.board.study.Auth.exception.SecurityRuntimeException;
import com.basic.board.study.User.domains.Messenger;
import com.basic.board.study.User.domains.UserDAO;
import com.basic.board.study.User.domains.UserDTO;
import com.basic.board.study.User.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
//1. 현재 부분이 Service임을 알려주는 어노테이션

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private final ModelMapper modelMapper;


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
    public UserDTO login(UserDTO userDTO) {

        try {
            UserDTO returnUser = new UserDTO();
            String username = userDTO.getUsername();
            UserDAO findUser = userRepository.findByUsername(username).orElse(null);
            if (findUser != null) {
                boolean checkPassword = encoder.matches(userDTO.getPassword(), findUser.getPassword());
                if (checkPassword) {
                    returnUser = modelMapper.map(findUser, UserDTO.class);
                    findUser = modelMapper.map(returnUser, UserDAO.class);
                } else {
                    String token = "로그인 실패";
                }
            } else {
            }
            return returnUser;
        }catch (Exception e){
            throw new SecurityRuntimeException("유효하지 않은 아이디/비밀번호", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @Override
    public Messenger logout(HttpServletRequest request) {
        return null;
    }

    @Override
    public void partialUpdate(UserDTO userDTO) {

    }

    @Override
    public void delete(UserDTO userDTO) throws Exception {
        UserDAO user = userRepository.findByUsername(userDTO.getUsername()).orElse(null);
        userRepository.delete(user);
    }

    @Override
    public Messenger deleteAll() {
        userRepository.deleteAll();
        return Messenger.builder().message("삭제 완료").build();
    }

    @Override
    public List<UserDAO> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserDAO> findAll(Sort sort) {
        return userRepository.findAll(sort.by(Sort.Direction.DESC,"username"));
    }

    @Override
    public Messenger update(UserDAO userDAO) {
        return null;
    }


}
