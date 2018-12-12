package cn.com.demo.dubbo.consumer.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.com.demo.dubbo.DubboConsumerAppStart;
import cn.com.demo.dubbo.consumer.DemoService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DubboConsumerAppStart.class)
public class TestServiceConsumer {
	@Autowired
    private DemoService demoService;
	@Test
    public void test() {
    	System.out.println(this.demoService.findUserById("22"));
    }
}
