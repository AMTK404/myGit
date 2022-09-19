package com.lyh.service;

import com.lyh.domain.Depth;
import com.lyh.mapper.IDepthMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepthService {

    @Autowired
    IDepthMapper mapper;

    //增加部门
    public int addDepth(Depth depth){
        int result = mapper.addDepth(depth);
        return result;
    }

    //删除部门
    public int deleteDepth(int id){
        int result = mapper.deleteDepth(id);
        return result;
    }

    //更新部门
    public int updateDepth(Depth depth){
        int result = mapper.updateDepth(depth);
        return result;
    }

    //查询部门及其下属部门
    public List<Depth> getDepth(int id){
        List<Depth> list = mapper.getDepth(id);
        return list;
    }

    //显示所有部门
    public List<Depth> getDepthList(){
        List<Depth> list = mapper.getDepthList();
        return list;
    }

}
