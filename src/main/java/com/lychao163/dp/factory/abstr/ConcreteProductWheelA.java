package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:12
 * @since Tiger.SR
 */
public class ConcreteProductWheelA implements AbstractProductWheel {
    @Override
    public void operationWheel() {
        System.out.println("生产型号A的轮子");
    }
}
