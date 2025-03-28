package com.sky.controller.user;


import com.sky.entity.Menu;
import com.sky.result.Result;
import com.sky.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userMenuController")
@RequestMapping("/user/menu")
@Api(tags = "C端-菜单接口")
@Slf4j
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 查询菜单
     * @return
     */
    @GetMapping("/list")
    @ApiOperation("查询菜单")
    public Result<List<Menu>> list() {
        log.info("查询菜单");
        List<Menu> list = menuService.list();
        return Result.success(list);
    }
}