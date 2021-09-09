package cn.lei.springframework.beans.factory.support;

import cn.lei.springframework.beans.BeansException;
import cn.lei.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ll
 * @since 2021/9/9
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override

    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();

        try {
            if (constructor != null) {
                // 有参构造方法
                return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
            } else {
                // 无参构造方法
                return clazz.getDeclaredConstructor().newInstance();
            }

        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            throw new BeansException("Failed to instatiate [" + clazz.getName() + "]");
        }
    }
}
