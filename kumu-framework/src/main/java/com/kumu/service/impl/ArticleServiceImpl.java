package com.kumu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kumu.constants.SystemConstants;
import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.Article;
import com.kumu.domain.vo.HotArticleVo;
import com.kumu.mapper.ArticleMapper;
import com.kumu.service.ArticleService;
import com.kumu.utils.BeanCopyUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章，封装成ResponseResult
        LambdaQueryWrapper<Article> queryWrapper=new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        //按照浏览量排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多十条消息
        Page<Article> page=new Page(1,10);
        page(page,queryWrapper);
        List<Article> articles = page.getRecords();
        List<HotArticleVo> articleVos = new ArrayList<>();
        List<HotArticleVo> vs = BeanCopyUtils.copyBeanList(articles, HotArticleVo.class);
        return ResponseResult.okResult(vs);
    }
}
