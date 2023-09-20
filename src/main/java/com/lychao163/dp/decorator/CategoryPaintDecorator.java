package com.lychao163.dp.decorator;

/**
 * 品类装饰器：换品类加50
 * @author L.yc
 * @date 2023/9/20 10:34
 * @since Tiger.SR
 */
public class CategoryPaintDecorator extends CarPaintDecorator {

    public CategoryPaintDecorator(CarPaint carPaint) {
        super(carPaint);
    }

    @Override
    public Double getPaintPrice() {
        return carPaint.getPaintPrice() + 50;
    }
}
