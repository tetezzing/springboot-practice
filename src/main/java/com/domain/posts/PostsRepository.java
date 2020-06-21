package com.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// JpaRepository<Entity, pk타입>
// Dao 역할
// @Repository도 추가할 필요가 없다
public interface PostsRepository  extends JpaRepository<Posts, Long> {

    // SpringDataJpa에서 제공하지 않는 메소드는 따로 쿼리 어노테이션 달고 직접 적으면 된다
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
