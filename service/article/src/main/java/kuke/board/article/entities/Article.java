package kuke.board.article.entities;


import lombok.Getter;

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
public class Article {
    private Long articleId;
    private String title;
    private String content;
    private Long boardId;
    private Long writerId;
    private String createdAt;
    private String modifiedAt;



    public Article(Long articleId, String title, String content, Long boardId, Long writerId, String createdAt, String modifiedAt) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.boardId = boardId;
        this.writerId = writerId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

}
