package com.fastcampus.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article-comments")
public class ArticleCommentController {

    @GetMapping
    public void getArticleComments() {

    }

    @GetMapping("/{article-comment-id}")
    public void getArticleComment(@PathVariable("article-comment-id") Long articleCommentId) {

    }

}
