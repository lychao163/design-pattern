package com.lychao163.dp.decorator;

/**
 * 颜色类装饰器:换颜色加10元
 *
 * @author L.yc
 * @date 2023/9/20 10:29
 * @since Tiger.SR
 */
public class ColorPaintDecorator extends CarPaintDecorator {
    public ColorPaintDecorator(CarPaint carPaint) {
        super(carPaint);
    }

    @Override
    public Double getPaintPrice() {
        return carPaint.getPaintPrice() + 10;
    }
}
