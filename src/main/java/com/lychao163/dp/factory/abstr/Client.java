package com.lychao163.dp.factory.abstr;

/**
 * @author L.yc
 * @date 2023/3/27 11:16
 * @since Tiger.SR
 */
public class Client {
    private AbstractProductEngine productEngine;
    private AbstractProductWheel productWheel;

    public Client(AbstractCarFactory factory) {
        productEngine = factory.createProductEngine();
        productWheel = factory.createProductWheel();
    }

    public void run() {
        productEngine.produceEngine();
        productWheel.operationWheel();
    }
}
