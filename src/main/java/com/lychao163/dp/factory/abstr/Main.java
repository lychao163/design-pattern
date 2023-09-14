package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:09
 * @since Tiger.SR
 */
public class Main {

    public static void main(String[] args) {
        Client client1 = new Client(new WorkshopFactoryA());
        client1.run();

        Client client2 = new Client(new WorkshopFactoryB());
        client2.run();
    }
}
