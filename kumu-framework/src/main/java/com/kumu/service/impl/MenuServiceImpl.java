package com.kumu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kumu.domain.ResponseResult;
import com.kumu.domain.entity.LoginUser;
import com.kumu.domain.entity.Menu;
import com.kumu.domain.entity.User;
import com.kumu.domain.vo.AdminUserInfoVo;
import com.kumu.domain.vo.UserInfoVo;
import com.kumu.mapper.MenuMapper;
import com.kumu.service.MenuService;
import com.kumu.service.RoleService;
import com.kumu.utils.BeanCopyUtils;
import com.kumu.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单权限表(Menu)表服务实现类
 *
 * @author makejava
 * @since 2023-08-10 16:19:49
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper,Menu> implements MenuService {
    @Autowired
    private RoleService roleService;
    @Override
    public ResponseResult<AdminUserInfoVo> getInfo() {
        //获取当前登录用户
        LoginUser loginUser = SecurityUtils.getLoginUser();
        //根据用户id查询权限
        List<String> perms = selectPermsByUserId(loginUser.getUser().getId());
        //根据用户id查询角色信息
        List<String> roleKeyList = roleService.selectRoleKeyByUserId(loginUser.getUser().getId());
        //获取用户信息
        User user = loginUser.getUser();
        UserInfoVo userInfoVo = BeanCopyUtils.copyBean(user, UserInfoVo.class);
        //封装数据返回
        AdminUserInfoVo adminUserInfoVo = new AdminUserInfoVo(perms,roleKeyList,userInfoVo);
        return ResponseResult.okResult(adminUserInfoVo);
    }

    private List<String> selectPermsByUserId(Long id){ //根据用户id查询权限

        return null;
    }
}

