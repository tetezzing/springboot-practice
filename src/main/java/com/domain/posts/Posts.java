package com.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
// 실제 DB의 테이블과 매칭될 클래스(Entity class)
public class Posts extends BaseTimeEntity {

    @Id
    // pk의 생성규칙ㄴ
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // udpate용
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }

}
