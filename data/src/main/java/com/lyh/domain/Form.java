package com.lyh.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Form {

    private int id;

    private String eName;

    private int dId;

    private Date createTime;

    private String[] type;

    private String reason;

    private Date eStartTime;

    private Date eEndTime;

    private Date rStartTime;

    private Date rEndTime;

    private String supAdvice;

    private String gmAdvice;

    private String remark;

    private int status;

}
