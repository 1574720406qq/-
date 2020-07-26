package com.wangniubi.orderpizza;

import com.wangniubi.pizza.ChessPizza;
import com.wangniubi.pizza.Pizza;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 4:58 下午 2020/7/26
 * @Modified By:
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if ("chess".equals(orderType)){
            pizza = new ChessPizza();
            pizza.setName("chess");
        }else if("fruit".equals(orderType)){
            pizza = new ChessPizza();
            pizza.setName("fruit");
        }
        return pizza;
    }
}
