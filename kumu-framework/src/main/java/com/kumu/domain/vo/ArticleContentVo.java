package com.kumu.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArticleContentVo {
    private Long id;//标题
    private String title;//文章摘要
    private String summary;//所属分类名
    private Long categoryId;
    private String categoryName;
    private String content;
    private String thumbnail;
    //访问量
    private Long viewCount;
    private Date createTime;
}