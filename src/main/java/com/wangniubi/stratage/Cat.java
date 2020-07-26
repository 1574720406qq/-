package com.wangniubi.stratage;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 7:44 下午 2020/7/26
 * @Modified By:
 */
public class Cat{
    public int weight,height;

    public Cat(int weight,int height){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
