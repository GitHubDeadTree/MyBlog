package com.kumu.service;


import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);
}
