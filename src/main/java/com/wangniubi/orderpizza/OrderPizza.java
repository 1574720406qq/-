package com.wangniubi.orderpizza;

import com.wangniubi.pizza.Pizza;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 4:21 下午 2020/7/26
 * @Modified By:
 */
public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do{
            orderType = "";
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
            }
        }while (true);
    }
}
