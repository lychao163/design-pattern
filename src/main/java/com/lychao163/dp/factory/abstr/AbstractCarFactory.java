package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:09
 * @since Tiger.SR
 */
public interface AbstractCarFactory {
    /**
     * 抽象工厂(汽车引擎)
     */
   AbstractProductEngine createProductEngine();
    /**
     * 抽象工厂（汽车轮子）
     */
   AbstractProductWheel createProductWheel();
}
