package com.lychao163.dp.decorator;

/**
 * @author L.yc
 * @date 2023/9/20 10:35
 * @since Tiger.SR
 */
public class Main {
    public static void main(String[] args) {
        //常规品价格
        CarPaint generalPaint = new GeneralPaint();
        //换品类后的价格
        generalPaint = new CategoryPaintDecorator(generalPaint);
        //换颜色后的价格
        generalPaint = new ColorPaintDecorator(generalPaint);
        //最后的价格
        System.out.println(generalPaint.getPaintPrice());
    }
}
