package com.qilinger.blog.controller

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import com.qilinger.blog.entity.articles
import com.qilinger.blog.mapper.ArticleMapper
import com.qilinger.blog.model.Article
import com.qilinger.blog.service.IArticleService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController("/article")
class ArticlesController {

    @Autowired
    private lateinit var articleMapper: ArticleMapper


    @GetMapping("/test")
    @ApiOperation("获取文章列表")
    fun getarticlelist(
        @ApiParam(value = "文章时间",required = false)@RequestParam time:Date,
        @RequestParam(defaultValue = "1") currentPage: Int,
        @RequestParam(defaultValue = "10") pageSize: Int
    ): MutableList<Article>? {

        val qw = QueryWrapper<Article>()
        qw.eq("ArticleID","11")
        return articleMapper.selectList(null)
    }


}