package cn.lei.springframework.beans.factory.support;

import cn.lei.springframework.beans.BeansException;
import cn.lei.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 实例化策略接口
 * 负责由Bean类的默认构造函数，带参构造函数或者工厂方法来实例化Bean
 *
 * @author ll
 * @date 2021/9/9
 */
public interface InstantiationStrategy {
    /**
     * 指定构造方法
     *
     * @param beanDefinition BeanDefinition
     * @param beanName       BeanName
     * @param constructor    构造器
     * @param args           参数
     * @return 实例化Bean
     * @throws BeansException 异常
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException;
}
