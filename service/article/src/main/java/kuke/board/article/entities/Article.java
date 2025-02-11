package kuke.board.article.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Article Entity
 create table article
 (
 article_id  bigint        not null primary key,
 title       varchar(100)  not null,
 content     varchar(3000) not null,
 board_id    bigint        not null,
 writer_id   bigint        not null,
 created_at  datetime      not null,
 modified_at datetime      not null
 );

 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writerId;
    private String createdAt;
    private String modifiedAt;


}
