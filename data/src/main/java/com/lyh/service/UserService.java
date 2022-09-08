package com.lyh.service;

import com.lyh.domain.User;
import com.lyh.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserMapper mapper;

    //查询
    public User getUser(int id){
        User user = mapper.getUser(id);
        return user;
    }

    //增加
    public int addUser(User user){
        int result = mapper.addUser(user);
        return result;
    }

    //更新
    public int updateUser(User user){
        int result = mapper.updateUser(user);
        return result;
    }

    //删除
    public int deleteUser(int id){
        int result = mapper.deleteUser(id);
        return result;
    }
}
