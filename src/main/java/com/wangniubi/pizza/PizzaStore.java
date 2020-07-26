package com.wangniubi.pizza;

import com.wangniubi.orderpizza.OrderPizza;
import com.wangniubi.orderpizza.SimpleFactory;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 5:38 下午 2020/7/26
 * @Modified By:
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("~~~~退出程序~~~~~");
    }
}
