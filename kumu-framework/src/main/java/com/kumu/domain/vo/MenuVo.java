package com.kumu.domain.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.connection.ReactiveHashCommands;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVo {
    //菜单ID@TableId
    private Long id;

    //菜单名称
    private String menuName;
    //父菜单ID
    private Long parentId;
    //显示顺序
    private Integer orderNum;
    //路由地址
    private String path;
    //组件路径
    private String component;
    //是否为外链（0是 1否）
    private Integer isFrame;
    //菜单类型（M目录 C菜单 F按钮）
    private String menuType;
    //菜单状态（0显示 1隐藏）
    private String visible;
    //菜单可视（0正常 1停用）
    private String status;

    //菜单图标
    private String icon;
    //创建时间
    private Object createTime;
    @TableField(exist = false)
    private List<MenuVo> children;

}