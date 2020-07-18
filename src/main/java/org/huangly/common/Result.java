package org.huangly.common;

import lombok.Data;

@Data
public class Result<T> {

    public static final int SUCCESS=200;
    public static final int FAIL=-200;

    private int code;
    private String message;
    private T data;

    public Result(int code,String message,T data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    public static Result success(){
        return success(null);
    }
    public static<T> Result success(T data){
        return new Result<>(SUCCESS,"success",data);
    }

    public static  Result fail(){
        return fail("fail");
    }

    public static  Result fail(String message){
        return new Result<>(FAIL,message,null);
    }


}
