package com.kumu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.LoginUser;
import com.kumu.domain.entity.Menu;
import com.kumu.domain.vo.AdminUserInfoVo;
import com.kumu.mapper.MenuMapper;
import com.kumu.service.MenuService;
import com.kumu.utils.SecurityUtils;
import org.springframework.stereotype.Service;

/**
 * 菜单权限表(Menu)表服务实现类
 *
 * @author makejava
 * @since 2023-08-10 16:19:49
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {
    @Override
    public ResponseResult<AdminUserInfoVo> getInfo() {
        //获取当前登录用户
        LoginUser loginUser = SecurityUtils.getLoginUser();
        //根据用户id查询权限
        //根据用户id查询角色信息

        //封装数据返回
    }
}

