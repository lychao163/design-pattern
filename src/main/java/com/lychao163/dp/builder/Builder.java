package com.lychao163.dp.builder;

/**
 * @author L.yc
 * @date 2023/4/25 11:15
 * @since Tiger.SR
 */
public interface Builder {
    void buildPartA(String partA);
    void buildPartB(String partB);
    void buildPartC(String partC);
    Product getResult();
}
