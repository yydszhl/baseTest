package com.zhentao;

import com.zhentao.common.annotation.NoAuthRequest;
import com.zhentao.common.constants.CommonConstants;
import com.zhentao.common.enums.ErrorEnum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;

@SpringBootTest
class BaseTestApplicationTests {


//    @NoAuthRequest

    /**
     * getDeclaredMethods() 只获取本类中所有的方法，包括私有方法和公有方法
     */

    //自定义注解
    @Test
    void contextLoads() throws NoSuchMethodException {
        BaseTestApplicationTests tests = new BaseTestApplicationTests();
        Method method = tests.getClass().getDeclaredMethod("contextLoads");

        System.out.println(method);
        NoAuthRequest annotation = method.getAnnotation(NoAuthRequest.class);
        if (annotation != null) {
            System.out.println("有注解，无授权也可访问");
        } else {
            System.out.println("无注解，需要授权");
        }

    }


    @Test
        //常量测试
    void testConstants() {
        System.out.println(CommonConstants.SUCCESS_CODE);
        System.out.println(CommonConstants.SUCCESS_DESC);

        System.out.println("常量map内容为:");
        CommonConstants.map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }

    //枚举测试
    @Test
    void enumTest() {
        System.out.println(ErrorEnum.SUCCESS.getCode());
        System.out.println(ErrorEnum.SUCCESS.getMsg());

        System.out.println(ErrorEnum.FAIL.getCode());
        System.out.println(ErrorEnum.FAIL.getMsg());
    }
}
