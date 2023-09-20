package com.lychao163.dp.decorator;

/**
 * 车漆装饰类
 * @author L.yc
 * @date 2023/9/20 10:15
 * @since Tiger.SR
 */
public abstract class CarPaintDecorator implements CarPaint {

    protected CarPaint carPaint;

    public CarPaintDecorator(CarPaint carPaint) {
        this.carPaint = carPaint;
    }

}
