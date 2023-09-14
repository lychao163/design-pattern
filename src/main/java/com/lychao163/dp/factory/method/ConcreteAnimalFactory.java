package com.lychao163.dp.factory.method;

/**
 * @author L.yc
 * @date 2023/3/27 10:53
 * @since Tiger.SR
 */
public class ConcreteAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog("Dog", "汪汪");
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat("Cat", "喵喵");
        } else {
            throw new RuntimeException("Invalid animal type");
        }
    }
}
