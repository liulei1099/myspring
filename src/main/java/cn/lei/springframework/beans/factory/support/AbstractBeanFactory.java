package cn.lei.springframework.beans.factory.support;

import cn.lei.springframework.beans.BeansException;
import cn.lei.springframework.beans.factory.BeanFactory;
import cn.lei.springframework.beans.factory.config.BeanDefinition;
import com.sun.istack.internal.Nullable;

/**
 * 抽象类定义模板方法
 *
 * @author ll
 * @date 2021/9/7
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition bdf = getBeanDefinition(name);
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);
    }

    protected <T> T doGetBean(final String name, @Nullable Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition bdf = getBeanDefinition(name);
        return (T) createBean(name, bdf, args);

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition bdf, Object[] args) throws BeansException;
}
