package com.lychao163.dp.listen;

/**
 * 事件监听器的具体实现类
 *
 * @author L.yc
 * @date 2023/9/18 16:44
 * @since Tiger.SR
 */
public class EventListenerImpl implements EventListener {
    @Override
    public void publishEvent(EventSubject e) {
        System.out.println("监听到发布动作，开始做相关的事情。。。。");
    }
}
