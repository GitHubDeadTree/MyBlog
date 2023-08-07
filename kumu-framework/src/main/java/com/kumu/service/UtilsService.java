package com.kumu.service;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.kumu.domain.entity.User;

public interface UtilsService {
    int countByWrapper(LambdaQueryWrapper<User> wrapper);

}