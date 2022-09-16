package com.lyh.service;

import com.lyh.domain.Emp;
import com.lyh.mapper.IEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    IEmpMapper mapper;

    //增加员工
    public int addEmp(Emp emp){
        int i = mapper.addEmp(emp);
        return i;
    }

    //删除员工
    public int deleteEmp(int id){
        int i = mapper.deleteEmp(id);
        return i;
    }

    //更新员工
    public int updateEmp(Emp emp){
        int i = mapper.updateEmp(emp);
        return i;
    }

    //查询员工
    public Emp getEmp(int id){
        Emp emp = mapper.getEmp(id);
        return emp;
    }

    //查询指定部门员工
    public List<Emp> getEmpList(int dId){
        List<Emp> list = mapper.getEmpList(dId);
        return list;
    }
}
