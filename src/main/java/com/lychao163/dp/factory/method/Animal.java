package com.lychao163.dp.factory.method;

import lombok.Getter;
import lombok.Setter;

/**
 * @author L.yc
 * @date 2023/3/27 10:49
 * @since Tiger.SR
 */
@Getter
@Setter
public class Animal {
    private String name;

    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
}
