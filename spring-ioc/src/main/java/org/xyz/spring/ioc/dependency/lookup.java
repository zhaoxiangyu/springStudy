package org.xyz.spring.ioc.dependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xyz.spring.ioc.domain.User;

public class lookup {

    public static void main(String [] args){
        BeanFactory bc=new ClassPathXmlApplicationContext("classpath:/dependency-lookup-context.xml");
        User user= (User) bc.getBean("user");
        System.out.println(user);
    }
}
