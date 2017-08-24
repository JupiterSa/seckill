package org.seckill.dto;

/**
 * Created by ADMINIBM on 2017/8/24.
 */
//所有ajax请求返回类型，封装JSON结果
public class SeckillResult<T> {
    private boolean success;
    private T date;
    private String error;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setDate(T date) {
        this.date = date;
    }

    public void setError(String error) {
        this.error = error;
    }


    public boolean isSuccess() {
        return success;
    }

    public T getDate() {
        return date;
    }

    public String getError() {
        return error;
    }

    public SeckillResult(boolean success, T date) {

        this.success = success;
        this.date = date;
    }

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }
}
