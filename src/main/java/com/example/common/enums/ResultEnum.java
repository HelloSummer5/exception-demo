package com.example.common.enums;

/**
 * @ClassName ResultEnum
 * @Description 相关错误码和信息
 * @Auth wujinjuan
 * @Date 2019/6/20 10:03
 * @Version 1.0
 **/
public enum ResultEnum {

    UNKOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),

    ERROR(10001,"自定义业务异常信息"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsg(int code) {
        for (ResultEnum ele : values()) {
            if(ele.getCode().equals(code)) return ele.getMsg();
        }
        return null;
    }
}
