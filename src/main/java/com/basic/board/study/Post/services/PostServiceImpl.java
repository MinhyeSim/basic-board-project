package com.basic.board.study.Post.services;

import com.basic.board.study.Post.domains.PostDAO;
import com.basic.board.study.Post.domains.PostDTO;
import com.basic.board.study.Post.repositories.PostRepository;
import com.basic.board.study.User.domains.Messenger;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Messenger save(PostDTO postDTO) {
        System.out.println("서비스로 전달된 게시글 정보: "+postDTO.toString());
        String result = "등록 완료";
        postRepository.save(PostDAO.builder()
                .title(postDTO.getTitle())
                .content(postDTO.getContent())
                .writer(postDTO.getWriter()).build());
        return Messenger.builder().message(result).build();
    }

    @Override
    public void delete(PostDTO postDTO) {

    }

    @Override
    public List<PostDAO> findAll(Sort sort) {
        return postRepository.findAll(sort);
    }

    @Override
    public Messenger modify(PostDAO postDAO) {
        return null;
    }
}
