package com.kumu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kumu.domain.entity.Article;
import com.kumu.mapper.ArticleMapper;
import com.kumu.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
