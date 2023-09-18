package com.lychao163.dp.listen;

/**
 * @author L.yc
 * @date 2023/9/18 16:50
 * @since Tiger.SR
 */
public class Main {
    public static void main(String[] args) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.registerEventListener(new EventListenerImpl());
        eventEntity.publishAction();
    }
}
