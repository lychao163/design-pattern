package com.lychao163.dp.observer;

/**
 * @author L.yc
 * @date 2023/9/18 17:59
 * @since Tiger.SR
 */
public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ZhangSanObserverImpl();
        Observer observer2 = new LiSiObserverImpl();
        Subject subject = new SubjectImpl();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.notifyObservers();
    }
}
