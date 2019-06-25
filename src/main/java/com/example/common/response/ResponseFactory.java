package com.example.common.response;

import com.example.common.enums.ResultEnum;

/**
 * @ClassName ResponseFactory
 * @Description
 * @Auth wujinjuan
 * @Date 2019/6/19 11:25 AM
 * @Version 1.0
 **/
public class ResponseFactory {
    /**
     * 公共私有静态函数
     * @param code
     * @return
     */
    private static Result commonBuild(int code, String errmsg) {
        Result result = new Result();
        result.setCode(code);
        if (errmsg == null || errmsg.trim().length() == 0) {
            result.setMsg(ResultEnum.getMsg(code));
        } else {
            result.setMsg(errmsg);
        }
        return result;
    }

    /**
     * 指定响应码-需预先在 @ResultEnum 里定义响应码
     * <pre>
     *     {
     *         "code":{code}
     *         "msg":{message}
     *     }
     * </pre>
     * @param code
     * @return
     * @see ResultEnum
     */
    public static Result build(int code) {
        Result json = commonBuild(code, ResultEnum.getMsg(code));
        return json;
    }

    /**
     * 成功响应
     * <p>
     * <pre>
     * {
     *     "code":0,
     *     "msg":"success."
     * }
     * </pre>
     *
     * @return
     */
    public static Result build() {
        Result json = commonBuild(ResultEnum.SUCCESS.getCode(), null);
        return json;
    }

    /**
     * 成功响应
     * <pre>
     *     {
     *         "code":{code}
     *         "msg":{message}
     *     }
     * </pre>
     *
     * @param data 需要返回的数据对象
     * @return
     * @see ResultEnum
     */
    public static Result build(Object data) {
        Result json = commonBuild(ResultEnum.SUCCESS.getCode(), null);
        json.setData(data);
        return json;
    }

    /**
     * 自定义返回码code，构建返回数据
     *
     * @param code
     * @return
     */
    public static Result build(int code, Object data) {
        Result result = commonBuild(code, null);
        result.setData(data);
        return result;
    }

    /**
     * 自定义返回码code，构建返回数据
     *
     * @param code
     * @return
     */
    public static Result build(int code, String msg) {
        Result result = commonBuild(code, msg);
        result.setData(null);
        return result;
    }

    /**
     * 自定义返回码code，构建返回数据
     *
     * @param code
     * @param count
     * @param obj
     * @return
     */
    public static Result build(int code, int count, Object obj) {
        Result result = commonBuild(code, null);
        result.setCount(count);
        result.setData(obj);
        return result;
    }

    /**
     * 自定义返回码code，构建返回数据
     *
     * @param code
     * @return
     */
    public static Result build(int code, String msg, Object data) {
        Result result = commonBuild(code, msg);
        result.setData(data);
        return result;
    }

    /**
     * 自定义返回码code，构建返回数据
     *
     * @param code
     * @return
     */
    public static Result build(int code, int count, String msg, Object data) {
        Result result = commonBuild(code, msg);
        result.setData(data);
        result.setCount(count);
        return result;
    }

}
