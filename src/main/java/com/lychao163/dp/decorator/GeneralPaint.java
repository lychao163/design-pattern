package com.lychao163.dp.decorator;

/**
 * 常规车漆价格
 * @author L.yc
 * @date 2023/9/20 10:22
 * @since Tiger.SR
 */
public class GeneralPaint implements CarPaint {

    @Override
    public Double getPaintPrice() {
        return 100.0;
    }
}
