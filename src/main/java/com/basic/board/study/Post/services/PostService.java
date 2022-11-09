package com.basic.board.study.Post.services;

import com.basic.board.study.Post.domains.PostDAO;
import com.basic.board.study.Post.domains.PostDTO;
import com.basic.board.study.User.domains.Messenger;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: com.basic.board.Post.services
 * fileName   : PostService
 * author     : MinhyeSim
 * date       : 2022-09-21
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-09-21     MinhyeSim       최초 생성
 */
public interface PostService {
    Messenger save(PostDTO postDTO);

    void delete(PostDTO postDTO);
    //void는 return값이 없기 때문에 사용하는 것이다.

    List<PostDAO> findAll(Sort sort);
    //List(hash,map)은 컬랙션

    Messenger modify(PostDAO postDAO);


}
