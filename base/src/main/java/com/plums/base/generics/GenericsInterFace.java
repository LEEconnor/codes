package com.plums.base.generics;

public interface GenericsInterFace<T> {
    public T next(T t);
}

class GenericsInterFaceTest<T> implements GenericsInterFace<T> {

    @Override
    public T next(T t) {
        return t;
    }

    public static void main(String[] args) {
        GenericsInterFaceTest genericsInterFaceTest = new GenericsInterFaceTest();
        System.out.println(genericsInterFaceTest.next("123").getClass().getName());
        System.out.println(genericsInterFaceTest.next(false).getClass().getName());

        // 不给泛型 自动泛型被设置为Object？？
        Object next = genericsInterFaceTest.next(123);
    }
}

class GenericsInterFaceTest2 implements GenericsInterFace{

    @Override
    public Object next(Object o) {
        return o;
    }
}

class GenericsInterFaceTest3 implements GenericsInterFace<String>{

    @Override
    public String next(String s) {
        return s;
    }
}