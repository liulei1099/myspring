package cn.lei.springframework.test;

import cn.lei.springframework.beans.factory.config.BeanDefinition;
import cn.lei.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.lei.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author ll
 * @date 2021/9/7
 */

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1、初始化BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2、注册Bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3、第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService", "test");
        userService.queryUserInfo();
        System.out.println(userService.toString());
    }
}
