package com.example.exception;

import com.example.common.enums.ResultEnum;
import lombok.Data;

@Data
public class DemoException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    /** 错误码 **/
    private Integer code;

    public DemoException() {}

    public DemoException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
