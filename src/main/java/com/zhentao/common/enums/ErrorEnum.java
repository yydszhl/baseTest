package com.zhentao.common.enums;

import lombok.Getter;

/**
 * 枚举类：
 * 1.只get
 * 2.私有化构造
 * 3.直接写对象
 */
@Getter
public enum ErrorEnum {
    SUCCESS(0, "成功"),
    FAIL(1, "失败");

    private int code;
    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
