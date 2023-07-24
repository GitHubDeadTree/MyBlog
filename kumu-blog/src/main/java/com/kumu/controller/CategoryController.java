package com.kumu.controller;

import com.kumu.domain.ResponseResult;
import com.kumu.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategorylist")
    public ResponseResult getCategorylist(){
        return categoryService.getCategoryList();
    }
}
