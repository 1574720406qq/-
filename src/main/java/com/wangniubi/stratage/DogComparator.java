package com.wangniubi.stratage;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 8:51 下午 2020/7/26
 * @Modified By:
 */
public class DogComparator implements Comparator<Cat>{
    public int compare(Cat o1, Cat o2) {
        //return o1.height - o2.height;
        if (o1.height > o2.height) return -1;
        else if (o1.height == o2.height) return 0;
        else return 1;
    }
}
