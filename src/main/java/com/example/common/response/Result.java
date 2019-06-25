
package com.example.common.response;

import lombok.Data;

/**
 * @ClassName Result
 * @Description service层开始返回Result
 * @Auth wujinjuan
 * @Date 2019/6/19 11:25 AM
 * @Version 1.0
 **/
@Data
public class Result {

    private int code;

    private int count = 0;

    private String msg;

    private Object data;

}
