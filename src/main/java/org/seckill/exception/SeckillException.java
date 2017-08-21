package org.seckill.exception;

/**
 * Created by ADMINIBM on 2017/8/20.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
