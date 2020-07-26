package com.wangniubi.stratage;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 7:52 下午 2020/7/26
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(4,5),new Cat(9,8),new Cat(1,1)};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(cats, (o1,o2) ->{
            //return 0;
            if (o1.height - o2.height > 0) return -1;
            else if (o1.height - o2.height == 0 ) return 0;
            else return 1;
        });
        System.out.println(Arrays.toString(cats));
    }
}
