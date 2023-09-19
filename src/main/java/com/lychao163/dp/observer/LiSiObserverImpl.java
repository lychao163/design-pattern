package com.lychao163.dp.observer;

/**
 * @author L.yc
 * @date 2023/9/19 19:00
 * @since Tiger.SR
 */
public class LiSiObserverImpl implements Observer{
    @Override
    public void update() {
        System.out.println("李四收到更新通知，准备爬山去");
    }
}
