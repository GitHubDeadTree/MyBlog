package com.kumu.controller;

import com.kumu.domain.ResponseResult;
import com.kumu.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/link")

public class LinkController {

    @Autowired
    private LinkService linkService;

    @GetMapping("/getFriendLink")
    public ResponseResult getFriendLink(){

        return linkService.getFriendLink();
    }
}
