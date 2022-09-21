package com.basic.board.User.controllers;

import com.basic.board.User.domains.Messenger;
import com.basic.board.User.domains.UserDAO;
import com.basic.board.User.domains.UserDTO;
import com.basic.board.User.services.UserService;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController//1. 라우터 역할
@RequestMapping("user/")  // 2. 리액트와 매핑 . 도메인
@RequiredArgsConstructor // 3. 생성자를 구현하기 위한 어노테이션
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private final UserService userService;
    //controller와 service를 상속관계로 만든 것임. -> @RequiredArgsConstructor를 달아줌
    //인스턴스화 시켜서 service 내부의 기능을 사용할 수 있게 함.
    //개체는 메소드를 호출할 수 있기 때문에 인스턴스를 생성해야하는 것이다.
    //로직은 서비스인플에서만 작성한다

   @PostMapping("/join")
    public ResponseEntity<Messenger> save(@RequestBody UserDTO userDTO) {
       return ResponseEntity.ok(userService.save(userDTO));
   }

    @PostMapping("/login")
    public ResponseEntity<Messenger> login(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok(userService.login(userDTO));
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public ResponseEntity<Messenger> logout(HttpServletRequest request) {
       return ResponseEntity.ok(userService.logout(request));}

    @PatchMapping(value = "/partialupdate") @ResponseBody
    public void partialUpdate(@RequestBody UserDTO userDTO) throws Exception{
       userService.partialUpdate(userDTO);
    }

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody UserDAO userDAO){
       return ResponseEntity.ok(userService.update(userDAO));
    }

    @DeleteMapping(value = "/delete") @ResponseBody
    public void delete(@RequestBody UserDTO userDTO) throws Exception{
       userService.delete(userDTO);
    }

    @DeleteMapping("/deleteAll")
    public Messenger deleteAll(){
       return userService.deleteAll();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<UserDAO>> findAll(){
       return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<UserDAO>> findAll(Sort sort) {
       return ResponseEntity.ok(userService.findAll(sort));
    }












}
