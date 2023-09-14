package com.lychao163.dp.builder;

/**
 * @author L.yc
 * @date 2023/4/25 11:16
 * @since Tiger.SR
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        Product product = builder.getResult();
        System.out.println(product.getPartA());
        System.out.println(product.getPartB());
        System.out.println(product.getPartC());
    }
}
