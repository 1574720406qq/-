package com.wangniubi;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 12:06 上午 2020/7/26
 * @Modified By:
 */
//Hungry Han style
public class Singleton {
    private final static Singleton singleton = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.tell();
    }
}

class SingletonStatic{
    private SingletonStatic(){

    }
    private static SingletonStatic singletonStatic;

    static {
        singletonStatic = new SingletonStatic();
    }

    public static SingletonStatic getInstance(){
        return singletonStatic;
    }
}

class SingletonLzayNotSafe{
    private static SingletonLzayNotSafe instance;
    private SingletonLzayNotSafe(){

    }
    public static SingletonLzayNotSafe getInstance(){
        if (instance == null){
            instance = new SingletonLzayNotSafe();
        }
        return instance;
    }
}

class SingletonLazySyncronized{
    private SingletonLazySyncronized(){

    }
    private static SingletonLazySyncronized singletonLazySyncronized;

    public static synchronized SingletonLazySyncronized getInstance(){
        if (singletonLazySyncronized == null){
            singletonLazySyncronized = new SingletonLazySyncronized();
        }
        return singletonLazySyncronized;
    }
}

class SingeletonLazyDoubleCheck{
    private SingeletonLazyDoubleCheck(){}
    private static volatile SingeletonLazyDoubleCheck newInestane;
    public static SingeletonLazyDoubleCheck getInstance(){
        if (newInestane == null){
            synchronized (SingeletonLazyDoubleCheck.class){
                if (newInestane == null){
                    newInestane = new SingeletonLazyDoubleCheck();
                }
            }
        }
        return newInestane;
    }
}

class SingletonStaticInnerClass{
    private SingletonStaticInnerClass(){}
    //private static SingletonStaticInnerClass singletonStaticInnerClass;
    private static class GetSingleInstance{
        private final static SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }
    public static SingletonStaticInnerClass getInstance(){
        return GetSingleInstance.INSTANCE;
    }
}

enum SingletonEnum{
    INSTANCE;

    public void tell(){
        System.out.println("hello mother fucker");
    }
}