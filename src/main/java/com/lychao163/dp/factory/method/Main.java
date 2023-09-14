package com.lychao163.dp.factory.method;

/**
 * @author L.yc
 * @date 2023/3/27 10:54
 * @since Tiger.SR
 */
public class Main {

    public static void main(String[] args) {
        ConcreteAnimalFactory concreteAnimalFactory = new ConcreteAnimalFactory();
        Animal dog = concreteAnimalFactory.createAnimal("dog");
        System.out.println("动物的种类名称：" + dog.getName() + "---------该种类的声音：" + dog.getSound());
        Animal cat = concreteAnimalFactory.createAnimal("cat");
        System.out.println("动物的种类名称：" + cat.getName() + "---------该种类的声音：" + cat.getSound());
    }
}
