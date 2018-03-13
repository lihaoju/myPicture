package org.haoju.li.api;

import org.haoju.li.bean.User;

/**
 * Created by lhj on 2017/10/29.
 */
public interface UserService {

    /**
     * 根据id查询用户
     *
     * @return
     */
    User getUserById(Integer id);
}
