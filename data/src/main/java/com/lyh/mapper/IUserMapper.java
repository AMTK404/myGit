package com.lyh.mapper;

import com.lyh.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //必须加该注释才能识别到
public interface IUserMapper {
    //增加用户
    int addUser(User user);

    //删除用户
    int deleteUser(int id);

    //更新用户
    int updateUser(User user);

    //查询用户
    User getUser(int id);
}
