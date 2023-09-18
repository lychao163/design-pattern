package com.lychao163.dp.observer;

/**
 * @author L.yc
 * @date 2023/9/18 17:58
 * @since Tiger.SR
 */
public class ObserverImpl implements Observer{
    @Override
    public void update() {
        System.out.println("收到更新，通知订阅者");
    }
}
