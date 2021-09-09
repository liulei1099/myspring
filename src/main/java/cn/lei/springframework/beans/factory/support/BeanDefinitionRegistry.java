package cn.lei.springframework.beans.factory.support;

import cn.lei.springframework.beans.factory.config.BeanDefinition;

/**
 * @author ll
 * @date 2021/9/6
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName       bean名称
     * @param beanDefinition bean定义
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
