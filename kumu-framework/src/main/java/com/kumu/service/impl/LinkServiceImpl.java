package com.kumu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.Link;
import com.kumu.mapper.LinkMapper;
import com.kumu.service.LinkService;
import org.springframework.stereotype.Service;

/**
 * 友链(Link)表服务实现类
 *
 * @author makejava
 * @since 2023-07-25 10:58:24
 */
@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

    @Override
    public ResponseResult getFriendLink() {


        return ResponseResult.okResult();
    }
}

