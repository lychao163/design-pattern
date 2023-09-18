package com.lychao163.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L.yc
 * @date 2023/9/18 17:55
 * @since Tiger.SR
 */
public class SubjectImpl implements Subject{
    List<Observer> observerList=new ArrayList<>();
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
