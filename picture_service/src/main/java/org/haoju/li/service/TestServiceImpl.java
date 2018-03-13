package org.haoju.li.service;

import org.haoju.li.api.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by lhj on 2017/10/21.
 */
@Service
public class TestServiceImpl implements TestService {

    public void sayHello() {
        System.out.println("hello");
    }
}
