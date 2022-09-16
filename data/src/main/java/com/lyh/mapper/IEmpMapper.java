package com.lyh.mapper;

import com.lyh.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IEmpMapper {
    //增加员工
    int addEmp(Emp emp);

    //删除员工
    int deleteEmp(int id);

    //更新员工
    int updateEmp(Emp emp);

    //查询员工
    Emp getEmp(int id);

    //查询该部门员工
    List<Emp> getEmpList(int dId);
}
