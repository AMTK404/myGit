package com.lyh.mapper;

import com.lyh.domain.Form;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IFormMapper {

    //申请请假单
    int askForm(Form form);

    //审批请假单
    int checkForm(Form form);

    //更改请假单
    int updateForm(Form form);

    //显示所有代办请假单
    List<Form> getFormList(int status);

    //查询指定请假单(详细信息)
    Form getForm(int id);

    //删除请假单
    int deleteForm(int id);


}
