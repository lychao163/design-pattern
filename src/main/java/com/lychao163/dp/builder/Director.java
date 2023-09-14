package com.lychao163.dp.builder;

/**
 * @author L.yc
 * @date 2023/4/25 11:16
 * @since Tiger.SR
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildPartA("PartA");
        builder.buildPartB("PartB");
        builder.buildPartC("PartC");
    }
}
