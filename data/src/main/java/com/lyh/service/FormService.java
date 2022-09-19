package com.lyh.service;

import com.lyh.domain.Form;
import com.lyh.mapper.IFormMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService {

    @Autowired
    IFormMapper mapper;

    //申请请假单
    public int askForm(Form form){
        int i = mapper.askForm(form);
        return i;
    }

    //审批请假单
    public int checkForm(Form form){
        int i = mapper.checkForm(form);
        return i;
    }

    //更改请假单
    public int updateForm(Form form){
        int i = mapper.updateForm(form);
        return i;
    }

    //显示所有代办请假单
    public List<Form> getFormList(int status){
        List<Form> list = mapper.getFormList(status);
        return list;
    }

    //查询指定请假单
    public Form getForm(int id){
        Form form = mapper.getForm(id);
        return form;
    }

    //删除请假单
    public int deleteForm(int id){
        int i = mapper.deleteForm(id);
        return i;
    }
}
