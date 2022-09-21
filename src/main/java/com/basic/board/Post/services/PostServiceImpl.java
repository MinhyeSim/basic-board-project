package com.basic.board.Post.services;

import com.basic.board.Post.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.basic.board.Post.services
 * fileName   : PostServiceimpl
 * author     : MinhyeSim
 * date       : 2022-09-21
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-09-21     MinhyeSim       최초 생성
 */

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
}
