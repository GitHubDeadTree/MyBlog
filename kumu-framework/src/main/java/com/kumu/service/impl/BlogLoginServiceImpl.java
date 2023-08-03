package com.kumu.service.impl;

import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.User;
import com.kumu.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Service;

@Service
public class BlogLoginServiceImpl implements BlogLoginService {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Override
    public ResponseResult login(User user) {
        return null;
    }
}
