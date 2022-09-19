package com.lyh.controller;

import com.lyh.domain.Depth;
import com.lyh.domain.Result;
import com.lyh.service.DepthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/depths")
public class DeptController {

    @Autowired
    DepthService depthService;

    //增加部门
    @PostMapping
    public Result addDepth(@RequestBody Depth depth){
        int result = depthService.addDepth(depth);
        String msg;
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

    //删除部门
    @DeleteMapping("/{id}")
    public Result deleteDepth(@PathVariable("id") int id){
        int row = depthService.deleteDepth(id);
        String msg;
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
    public Result updateDepth(@RequestBody Depth depth){
        String msg;
        int row = depthService.updateDepth(depth);
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
    public Result getDepth(@PathVariable("id") int id){
        List<Depth> list = depthService.getDepth(id);
        Result res = new Result();
        res.setCode(1);
        res.setMsg("查询结果");
        res.setData(list);
        return res;
    }

    //查询所有部门
    @GetMapping
    public Result getDepthList(){
        List<Depth> list = depthService.getDepthList();
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
