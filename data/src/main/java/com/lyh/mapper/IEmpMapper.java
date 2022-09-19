package com.lyh.mapper;

import com.lyh.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmpMapper {
    //员工登录
    Emp loginEmp(Emp emp);

    //增加员工
    int addEmp(Emp emp);

    //删除员工
    int deleteEmp(int id);

    //更新员工
    int updateEmp(Emp emp);

    //重置密码
    int resetPwd(int eId);

    //查询员工
    Emp getEmp(int id);

    //查询该部门员工
    List<Emp> getEmpList(int dId);
}
