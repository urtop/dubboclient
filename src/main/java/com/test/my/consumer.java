package com.test.my;

import com.my.api.IHi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        IHi hi = (IHi) context.getBean("hiService");
        String result = hi.sayhi("666");
        System.out.println(result);

    }
}
