package com.lychao163.dp.factory.simple;

/**
 * @author L.yc
 * @date 2023/3/22 11:16
 * @since Tiger.SR
 */
public class ConcreteProductA implements Product{
    @Override
    public void printProductDetails() {
        System.out.println("This is Product A");
    }
}
