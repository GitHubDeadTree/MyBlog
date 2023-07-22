package com.kumu.utils;

import com.kumu.domain.entity.Article;
import com.kumu.domain.vo.HotArticleVo;
import org.apache.poi.hssf.record.ObjRecord;
import org.springframework.beans.BeanUtils;

public class BeanCopyUtils {
    private BeanCopyUtils(){

    }

    public static <V> V copyBean(Object source,Class<V> clazz){ //通过字节码对象的反射，创建目标对象
        V result=null;
        try {
            result = clazz.newInstance();
            //复制属性
            BeanUtils.copyProperties(source,result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void main(String[] args) {
        Article article = new Article();
        article.setId(2L);
        HotArticleVo vo = copyBean(article, HotArticleVo.class);
        System.out.println(vo);
    }

}
