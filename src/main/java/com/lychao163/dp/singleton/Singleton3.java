package com.lychao163.dp.singleton;

/**
 * 饿汉式：成员变量
 *
 * @author L.yc
 * @date 2023/6/8 16:42
 * @since Tiger.SR
 */
public class Singleton3 {

    private static final Singleton3 INSTANCE = new Singleton3();

    /**
     * 私有构造函数，用于防止从外部实例化
     * private constructor to prevent instantiation from outside
     */
    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }
}
