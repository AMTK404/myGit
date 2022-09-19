package com.lyh.mapper;

import com.lyh.domain.Depth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDepthMapper {
    //增加部门
    int addDepth(Depth depth);

    //删除部门
    int deleteDepth(int id);

    //更新部门
    int updateDepth(Depth depth);

    //查询部门及其下属部门
    List<Depth> getDepth(int id);

    //显示所有部门
    List<Depth> getDepthList();
}
