package cn.lei.springframework.beans.factory;

import cn.lei.springframework.beans.BeansException;

/**
 * @author ll
 * @date 2021/9/7
 */
public interface BeanFactory {

    /**
     * 返回一个指定Bean实例
     *
     * @param name 被检索的Bean名称
     * @return Bean的实例
     * @throws BeansException 异常
     */
    Object getBean(String name) throws BeansException;

    /**
     * 返回一个指定Bean实例
     *
     * @param name 被检索的Bean名称
     * @param args 使用显示构造方法时构造参数（仅在创建实例时使用）
     * @return Bean的实例
     * @throws BeansException 异常
     */
    Object getBean(String name, Object... args) throws BeansException;
}
