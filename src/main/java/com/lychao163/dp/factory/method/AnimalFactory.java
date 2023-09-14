package com.lychao163.dp.factory.method;

/**
 * @author L.yc
 * @date 2023/3/27 10:48
 * @since Tiger.SR
 */
public interface AnimalFactory {

    /**
     * 工厂方法，用于根据传递的参数创建动物对象
     */
    Animal createAnimal(String type);
}
