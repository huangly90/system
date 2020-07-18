package org.huangly.exception.handler;


import lombok.extern.slf4j.Slf4j;
import org.huangly.common.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Throwable.class)
    public Result<String>  exceptionHandler(Throwable throwable){
        log.error("系统出错 :{}",throwable.getMessage(),throwable);
        return Result.fail("系统出错");
    }
}
