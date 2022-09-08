package com.lyh.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "用户实体",description = "用户相关详细解释")
public class User {
    @ApiModelProperty("用户编号")
    private int id;
    @ApiModelProperty("用户名")
    private String name;
    @ApiModelProperty("用户密码")
    private String password;
    @ApiModelProperty("用户年龄")
    private int age;
}
