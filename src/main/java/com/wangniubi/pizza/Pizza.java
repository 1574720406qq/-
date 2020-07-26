package com.wangniubi.pizza;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 4:13 下午 2020/7/26
 * @Modified By:
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();
    public void bake(){
        System.out.println(name + "baking" );
    }

    public  void setName(String name) {
        this.name = name;
    }
}


