package com.lyh.controller;

import com.lyh.domain.Depth;
import com.lyh.domain.Emp;
import com.lyh.domain.Result;
import com.lyh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService service;

    //增加员工
    @PostMapping
    public Result addEmp(@RequestBody Emp emp){
        String msg;
        int result = service.addEmp(emp);
        if (result == 1){
            msg = "增加成功";
        }else {
            msg = "增加失败";
        }
        Result res = new Result();
        res.setCode(result);
        res.setMsg(msg);
        return res;
    }

    //删除员工
    @DeleteMapping("/{id}")
    public Result deleteEmp(@PathVariable("id") int id){
        String msg;
        int row = service.deleteEmp(id);
        if (row == 1){
            msg = "删除成功";
        }else {
            msg = "删除失败";
        }
        Result res = new Result();
        res.setCode(row);
        res.setMsg(msg);
        return res;
    }

    //更新部门
    @PutMapping
    public Result updateEmp(@RequestBody Emp emp){
        String msg;
        int row = service.updateEmp(emp);
        if (row == 1){
            msg = "更新成功";
        }else {
            msg = "更新失败";
        }
        Result res = new Result();
        res.setCode(row);
        res.setMsg(msg);
        return res;
    }

    //查询部门
    @GetMapping("/{id}")
    public Result getEmp(@PathVariable("id") int id){
        String msg;
        int code;
        Emp emp = service.getEmp(id);
        if(emp != null){
            code = 1;
            msg = "查询成功";
        }else {
            code = 0;
            msg = "查询失败";
        }
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(emp);
        return res;
    }

    //查询所有部门
    @GetMapping("/{dId}")
    public Result getEmpList(@PathVariable("dId") int dId){
        List<Emp> list = service.getEmpList(dId);
        String msg;
        int code;
        if(list != null){
            code = 1;
            msg = "查询成功";
        }else {
            code = 0;
            msg = "查询失败";
        }
        Result res = new Result();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(list);
        return res;
    }

}
