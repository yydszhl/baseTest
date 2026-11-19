package com.zhentao.common.constants;

import java.util.HashMap;

//@Component
//静态不依赖于类存在
public class CommonConstants {
    //常量public static final ,大写下划线命名

    public static final Integer SUCCESS_CODE = 1;
    public static final String SUCCESS_DESC = "成功";
    public static final HashMap<String, Integer> map = new HashMap<>();

    //token_,order_,cart_三个前缀
    //静态代码块
    static {
        map.put("成功", 1);
    }
}
