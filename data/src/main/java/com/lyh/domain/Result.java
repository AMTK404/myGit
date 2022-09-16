package com.lyh.domain;

import lombok.Data;

@Data
public class Result<T> {

    //响应码
    private Integer code;
    //返回信息
    private String msg;
    //返回数据
    private T data;
}
