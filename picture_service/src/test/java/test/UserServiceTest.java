package test;

import org.haoju.li.api.UserService;
import org.haoju.li.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lhj on 2017/10/29.
 */
public class UserServiceTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        User user = userService.getUserById(1);
        System.out.println(user.getName());
    }
}
