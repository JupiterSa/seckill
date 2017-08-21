package org.seckill.exception;

/**
 * Java异常 = 运行期 + 编译期
 * 运行期异常不需要手动try catch,spring声明式事物只支持运行期异常回滚
 * spring 不会帮我们回滚非运行期异常
 *
 * 重复秒杀异常 （运行期异常）  不是不是编译期日常
 * Created by ADMINIBM on 2017/8/20.
 */
public class RepeatKillException extends SeckillException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
