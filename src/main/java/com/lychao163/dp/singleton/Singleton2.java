package com.lychao163.dp.singleton;

/**
 * 懒汉式：双重检查
 * @author L.yc
 * @date 2023/6/8 16:34
 * @since Tiger.SR
 */
public class Singleton2 {
    private volatile static Singleton2 instance = null;

    /**
     * 私有构造函数，用于防止从外部实例化
     * private constructor to prevent instantiation from outside
     */
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
