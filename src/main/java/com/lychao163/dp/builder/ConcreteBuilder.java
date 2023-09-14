package com.lychao163.dp.builder;

/**
 * @author L.yc
 * @date 2023/4/25 11:15
 * @since Tiger.SR
 */
public class ConcreteBuilder implements Builder{
    private Product product = new Product();

    @Override
    public void buildPartA(String partA) {
        product.setPartA(partA);
    }
    @Override
    public void buildPartB(String partB) {
        product.setPartB(partB);
    }
    @Override
    public void buildPartC(String partC) {
        product.setPartC(partC);
    }
    @Override
    public Product getResult() {
        return product;
    }
}
