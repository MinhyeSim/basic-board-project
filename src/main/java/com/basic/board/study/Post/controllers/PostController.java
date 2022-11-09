package com.basic.board.study.Post.controllers;

import com.basic.board.study.Post.domains.PostDAO;
import com.basic.board.study.Post.domains.PostDTO;
import com.basic.board.study.Post.services.PostService;
import com.basic.board.study.User.domains.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


import java.util.List;

/**
 * packageName: com.basic.board.Post.controllers
 * fileName   : PostController
 * author     : MinhyeSim
 * date       : 2022-09-21
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-09-21     MinhyeSim       최초 생성
 */

@RestController
@RequestMapping("post/")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    //Controller가 Service의 기능을 사용하기 위해 상속 관계를 가지므로 Controller가 자식.

    @PostMapping("/create")
    public ResponseEntity<Messenger> save(@RequestBody PostDTO postDTO){
        return ResponseEntity.ok(postService.save(postDTO));
    }

    @DeleteMapping(value = "/delete") @ResponseBody
    public void delete(@RequestBody PostDTO postDTO) throws Exception{
        postService.delete(postDTO);
    }

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<PostDAO>> findAll(Sort sort) {
        return ResponseEntity.ok(postService.findAll(sort));
    }

    @PutMapping("/modify")
    public ResponseEntity<Messenger> modify(@RequestBody PostDAO postDAO){
        return ResponseEntity.ok(postService.modify(postDAO));
    }



}
