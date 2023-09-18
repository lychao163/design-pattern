package com.lychao163.dp.observer;

/**
 * @author L.yc
 * @date 2023/9/18 17:53
 * @since Tiger.SR
 */
public interface Subject {

    /**
     * 注册
     *
     * @param o Observer
     */
    void registerObserver(Observer o);

    /**
     * 移除注册
     *
     * @param o Observer
     */
    void removeObserver(Observer o);

    /**
     * 通知
     */
    void notifyObservers();
}
