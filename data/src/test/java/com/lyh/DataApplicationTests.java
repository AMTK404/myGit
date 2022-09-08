package com.lyh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class DataApplicationTests {

    @Autowired
    JdbcTemplate jt;

    @Autowired
    DataSource ds;

    @Test
    void contextLoads() {
        System.out.println("数据源类型:"+ds);
        String sql = "select count(*) x from user";
        Integer result = jt.queryForObject(sql,int.class);
        System.out.println(result);
    }

}
