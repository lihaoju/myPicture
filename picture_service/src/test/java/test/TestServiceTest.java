package test;

import org.haoju.li.api.TestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lhj on 2017/10/21.
 */
public class TestServiceTest extends  BaseTest {

    @Autowired
    private TestService testService;

    @Test
    public void testSayHello() {
        testService.sayHello();
    }
}
