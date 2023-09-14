package com.lychao163.dp.factory.simple;

/**
 * @author L.yc
 * @date 2023/3/22 11:17
 * @since Tiger.SR
 */
public class Main {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct("A");
        Product productB = SimpleFactory.createProduct("B");
        productA.printProductDetails();
        productB.printProductDetails();
    }
}
