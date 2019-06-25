package com.example.exception;

import com.example.common.enums.ResultEnum;
import com.example.common.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName GlobalExceptionHandler
 * @Description 全局异常处理器
 * @Auth wujinjuan
 * @Date 2019/6/20 9:42
 * @Version 1.0
 **/
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /*
     * @Author wujinjuan
     * @Description 本系统业务异常
     * @Date 10:20 2019/6/25
     * @Param [request, e]
     * @return org.springframework.http.ResponseEntity<?>
     **/
    @ExceptionHandler(value = DemoException.class)
    public ResponseEntity<?> handlerException(DemoException e) {
        Result error = new Result();
        // 业务异常
        if(e instanceof DemoException) {
            log.info(this.getClass() + "业务异常：{}", e.getMessage());
            error.setCode(e.getCode());
            error.setMsg(e.getMessage());
//            error.setData(new JsonObject());
            return new ResponseEntity<>(error, HttpStatus.OK);
        }
        // 未知错误
        error.setCode(ResultEnum.UNKOWN_ERROR.getCode());
        error.setMsg(ResultEnum.UNKOWN_ERROR.getMsg());
        return new ResponseEntity<>(error, HttpStatus.OK);
    }

}
