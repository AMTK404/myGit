package com.lyh.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sql")
public class DbController {

    @Autowired
    JdbcTemplate jt;

    @GetMapping("/count")
    @ResponseBody
    public String hello(){
        String sql = "select count(*) x from user";
        Integer result = jt.queryForObject(sql,int.class);
        return "result:"+result;
    }

}
