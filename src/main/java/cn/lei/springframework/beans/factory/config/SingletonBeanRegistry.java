package cn.lei.springframework.beans.factory.config;

/**
 * 为共享 bean 实例定义注册表的接口。 可以通过{@link cn.lei.springframework.beans.factory.BeanFactory}
 * 实现来实现，以便以统一的方式公开它们的单例管理工具。
 * ConfigurableBeanFactory接口扩展了这个接口
 *
 * @author ll
 * @date 2021/9/7
 * <p>
 * 单例注册表
 */
public interface SingletonBeanRegistry {
    /**
     * 返回给定名称下注册的单例对象
     *
     * @param name 给定注册Bean名称
     * @return 注册的单例对象，或者 {@code null} 如果没有找到
     */
    Object getSingleton(String name);
}
