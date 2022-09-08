package com.lyh.controller;

import com.lyh.domain.User;
import com.lyh.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Api(tags="用户模块")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id查询用户",notes = "接口详细说明")
    @ResponseBody
    public String queryById(@PathVariable("id") int id){
        User user = service.getUser(id);
        return "查询结果:"+user;
    }

    @PostMapping
    @ApiOperation(value = "增加用户",notes = "增加接口详细说明")
    public String addUser(@RequestBody User user){
        log.info("用户增加:"+user);
        int i = service.addUser(user);
        return "增加结果："+i;
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除用户",notes = "删除接口详细说明")
    public String deleteUser(@PathVariable("id") int id){
        int i = service.deleteUser(id);
        return "删除结果:"+i;
    }

    @PutMapping
    @ApiOperation(value = "更新用户",notes = "更新接口详细说明")
    public String updateUser(@RequestBody User user){
        int i = service.updateUser(user);
        return "更新结果"+i;
    }
}
