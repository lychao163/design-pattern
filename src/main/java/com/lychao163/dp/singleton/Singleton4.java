package com.lychao163.dp.singleton;

/**
 * 饿汉式：静态代码快
 * @author L.yc
 * @date 2023/6/8 16:47
 * @since Tiger.SR
 */
public class Singleton4 {
    private static Singleton4 INSTANCE = null;

    static {
        INSTANCE = new Singleton4();
    }

    /**
     * 私有构造函数，用于防止从外部实例化
     * private constructor to prevent instantiation from outside
     */
    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return INSTANCE;
    }
}
