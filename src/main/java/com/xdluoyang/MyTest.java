package com.xdluoyang;

import com.xdluoyang.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User u = (User) context.getBean("user");
        System.out.println(u);
    }
}
