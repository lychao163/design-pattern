package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:12
 * @since Tiger.SR
 */
public class ConcreteProductEngineB implements AbstractProductEngine {
    @Override
    public void produceEngine() {
        System.out.println("生产型号B的汽车引擎");
    }
}