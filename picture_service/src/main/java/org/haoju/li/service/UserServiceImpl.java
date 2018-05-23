package org.haoju.li.service;

import org.haoju.li.api.UserService;
import org.haoju.li.bean.User;
import org.haoju.li.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lhj on 2017/10/29.
 */

@Service("userService")
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
