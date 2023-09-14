package com.lychao163.dp.factory.abstr;

/**
 * A型号的工厂车间
 *
 * @author L.yc
 * @date 2023/3/27 11:13
 * @since Tiger.SR
 */
public class WorkshopFactoryA implements AbstractCarFactory {
    @Override
    public AbstractProductEngine createProductEngine() {
        return new ConcreteProductEngineA();
    }

    @Override
    public AbstractProductWheel createProductWheel() {
        return new ConcreteProductWheelA();
    }
}