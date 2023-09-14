package com.lychao163.dp.factory.simple;

/**
 * @author L.yc
 * @date 2023/3/22 11:17
 * @since Tiger.SR
 */
public class SimpleFactory {
    public static Product createProduct(String type) {
        if ("A".equalsIgnoreCase(type)) {
            return new ConcreteProductA();
        } else if ("B".equalsIgnoreCase(type)) {
            return new ConcreteProductB();
        }
        return null;
    }
}
