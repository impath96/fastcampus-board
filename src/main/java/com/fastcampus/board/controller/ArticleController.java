package com.fastcampus.board.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @GetMapping
    public void getArticles() {

    }

    @GetMapping("/{article-id}")
    public void getArticle(@PathVariable("article-id") Long articleId) {

    }

    @PostMapping
    public void writeArticle() {

    }

    @PutMapping("/{article-id}")
    public void modifyArticle(@PathVariable("article-id") Long articleId) {

    }

    @DeleteMapping("/{article-id}")
    public void deleteArticle(@PathVariable("article-id") Long articleId) {

    }

    // == 게시글에 연관된 댓글 관련 기능 == //

    @GetMapping("/{article-id}/article-comments")
    public void getArticleComments(@PathVariable("article-id") Long articleId) {

    }

    @GetMapping("/{article-id}/article-comments/{article-comment-id}")
    public void getArticleComment(
        @PathVariable("article-id") Long articleId,
        @PathVariable("article-comment-id") Long articleCommentId
    ) {

    }

    @PostMapping("/{article-id}/article-comments")
    public void writeArticleComment(@PathVariable("article-id") Long articleId) {

    }

    @PutMapping("/{article-id}/article-comments/{article-comment-id}")
    public void modifyArticleComment(
        @PathVariable("article-id") Long articleId,
        @PathVariable("article-comment-id") Long articleCommentId
    ) {

    }

    @DeleteMapping("/{article-id}/article-comments/{article-comment-id}")
    public void deleteArticleComment(
        @PathVariable("article-id") Long articleId,
        @PathVariable("article-comment-id") Long articleCommentId
    ) {

    }

}
