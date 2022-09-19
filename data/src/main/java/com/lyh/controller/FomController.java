package com.lyh.controller;

import com.lyh.domain.Form;
import com.lyh.domain.Result;
import com.lyh.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/form")
public class FomController {

    @Autowired
    FormService service;

    //申请请假单
    @PostMapping
    public Result askForm(@RequestBody Form form){
        String msg;
        int i = service.askForm(form);
        if (i == 1){
            msg = "申请成功，请等待审批";
        }else {
            msg = "申请失败，请稍后重试";
        }
        Result result = new Result<>();
        result.setCode(i);
        result.setMsg(msg);
        return result;
    }

    //审批请假单
    @PutMapping("/check")
    public Result checkForm(@RequestBody Form form){
        String msg;
        int i = service.checkForm(form);
        if (i == 1){
            msg = "审批成功";
        }else {
            msg = "审批失败";
        }
        Result result = new Result<>();
        result.setCode(i);
        result.setMsg(msg);
        return result;
    }

    //更改请假单
    @PutMapping
    public Result updateForm(@RequestBody Form form){
        String msg;
        int i = service.updateForm(form);
        if (i == 1){
            msg = "更新成功";
        }else {
            msg = "更新失败";
        }
        Result result = new Result<>();
        result.setCode(i);
        result.setMsg(msg);
        return result;
    }

    //显示所有(代办)请假单
    @GetMapping("/list/{status}")
    public Result getFormList(@PathVariable("status") int status){
        List<Form> list = service.getFormList(status);
        Result result = new Result<>();
        result.setCode(1);
        result.setMsg("查询结果");
        result.setData(list);
        return result;
    }

    //查询指定请假单
    @GetMapping("/{id}")
    public Result getForm(@PathVariable("id") int id){
        int code;
        String msg;
        Form form = service.getForm(id);
        if (form != null){
            code = 1;
            msg = "查询成功";
        }else {
            code = 0;
            msg = "查询失败";
        }
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(form);
        return result;
    }

    //删除请假单
    @DeleteMapping("/{id}")
    public Result deleteForm(@PathVariable("id") int id){
        String msg;
        int i = service.deleteForm(id);  if (i == 1){
            msg = "删除成功";
        }else {
            msg = "删除失败";
        }
        Result result = new Result<>();
        result.setCode(i);
        result.setMsg(msg);
        return result;

    }
}
