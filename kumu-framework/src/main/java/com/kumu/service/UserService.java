package com.kumu.service;

import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.User;

public interface UserService {
    ResponseResult register(User user);
}
