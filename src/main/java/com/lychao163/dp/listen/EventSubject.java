package com.lychao163.dp.listen;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L.yc
 * @date 2023/9/18 16:42
 * @since Tiger.SR
 */
@Data
public class EventSubject {

    private List<EventListener> listeners = new ArrayList<>();

    /**
     * 注册监听器
     */
    public void registerEventListener(EventListener listener) {
        listeners.add(listener);
    }

    /**
     * 发布动作
     */
    public void publishAction() {
        System.out.println("发布动作");
        // 创建事件对象
        EventSubject eventSubject = new EventSubject();
        for (EventListener listener : listeners) {
            listener.publishEvent(eventSubject);
        }
    }
}
