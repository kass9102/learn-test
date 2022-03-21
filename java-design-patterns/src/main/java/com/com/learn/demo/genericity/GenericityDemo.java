package com.com.learn.demo.genericity;

import java.util.ArrayList;

public class GenericityDemo<T> {


    public static void main(String[] args) {
        // 测试泛型对类型的约束
//        List<String> list = new ArrayList<>();
//        list.add('a');
//        list.add(1);
//
//        for (Object o : list) {
//            System.out.println(o);
//        }
//        2
//        // 使用泛型方法的时候，不用指定该类为泛型类
//        // 泛型具有扩展方法能力的作用
//        GenericityDemo genericityDemo = new GenericityDemo();
//        genericityDemo.getName(2345);

        // 3
        GenericityDemo<String> genericityDemo = new GenericityDemo<>();
        ArrayList<String> strings = new ArrayList<>();
        genericityDemo.getName(strings);

        ArrayList<Integer> integers = new ArrayList<>();
        genericityDemo.getName(integers);

        genericityDemo.getNumber(new Integer[]{1}, 1);
    }


    public void getName(ArrayList<?> list) {
        System.out.println(list);
    }

//
//    public void getNumber(T... args){
//        System.out.println(args);
//    }

    public <S> void getNumber(S[] args, Integer num) {
        System.out.println(args);
    }
}
