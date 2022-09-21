package com.basic.board.Post.repositories;

import com.basic.board.Post.domains.PostDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.basic.board.Post.repositories
 * fileName   : PostRepository
 * author     : MinhyeSim
 * date       : 2022-09-21
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-09-21     MinhyeSim       최초 생성
 */

@Repository
public interface PostRepository extends JpaRepository<PostDAO, Long> {

}
