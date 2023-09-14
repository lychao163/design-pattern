package com.lychao163.dp.factory.abstr;

/**
 * B型号的工厂车间
 *
 * @author L.yc
 * @date 2023/3/27 11:14
 * @since Tiger.SR
 */
public class WorkshopFactoryB implements AbstractCarFactory {
    @Override
    public AbstractProductEngine createProductEngine() {
        return new ConcreteProductEngineB();
    }

    @Override
    public AbstractProductWheel createProductWheel() {
        return new ConcreteProductWheelB();
    }
}
