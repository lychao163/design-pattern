package com.lychao163.dp.listen;

/**
 * 事件监听器
 * @author L.yc
 * @date 2023/9/18 15:53
 * @since Tiger.SR
 */
public interface EventListener {

    /**
     * 发布事件
     * @param e EventEntity
     */
    void publishEvent(EventSubject e);
}
