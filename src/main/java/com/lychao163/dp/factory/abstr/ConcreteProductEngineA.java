package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:11
 * @since Tiger.SR
 */
public class ConcreteProductEngineA implements AbstractProductEngine {
    @Override
    public void produceEngine() {
        System.out.println("生产型号A的汽车引擎");
    }
}