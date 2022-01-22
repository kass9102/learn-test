package com.com.learn.demo.genericity;

public class MyList<E> {

    public <T, S> void add(T e, S s) {
        System.out.println("just test");
    }


    /**
     * 用于
     *
     * @author haitao
     * @date 2022/01/21
     */
    public void add(E e) {
        System.out.println("just test");
    }



}
