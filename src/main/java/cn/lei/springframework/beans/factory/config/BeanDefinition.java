package cn.lei.springframework.beans.factory.config;

/**
 * BeanDefinition 描述了一个 bean 实例，它具有属性值、构造
 * 函数参数值以及由具体实现提供的更多信息。这只是一个最小的接口
 *
 * @author ll
 * @date 2021/9/6
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
