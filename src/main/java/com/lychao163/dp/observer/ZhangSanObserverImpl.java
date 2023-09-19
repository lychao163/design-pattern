package com.lychao163.dp.observer;

/**
 * @author L.yc
 * @date 2023/9/18 17:58
 * @since Tiger.SR
 */
public class ZhangSanObserverImpl implements Observer{
    @Override
    public void update() {
        System.out.println("张三收到更新通知，装备做一顿大餐");
    }
}
