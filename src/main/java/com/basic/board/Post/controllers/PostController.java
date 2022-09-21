package com.basic.board.Post.controllers;

import com.basic.board.Post.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    
}
