package org.haoju.li.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.haoju.li.api.UserService;
import org.haoju.li.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @Reference
    private UserService userService;

    @RequestMapping(value = "index")
    @ResponseBody
    public String index() {
        User user = userService.getUserById(1);
        return user.getName();
    }
}
