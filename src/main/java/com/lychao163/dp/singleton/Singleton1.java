package com.lychao163.dp.singleton;

/**
 * 懒汉式：单线程使用
 * @author L.yc
 * @date 2023/6/8 16:32
 * @since Tiger.SR
 */
public class Singleton1 {
    private static Singleton1 instance = null;

    /**
     * 私有构造函数，用于防止从外部实例化
     * private constructor to prevent instantiation from outside
     */
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
