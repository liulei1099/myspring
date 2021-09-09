package cn.lei.springframework.beans;

/**
 * 定义bean异常
 *
 * @author ll
 * @date 2021/9/6
 */
public class BeansException extends RuntimeException {
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
