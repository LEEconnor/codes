package com.plums.base.generics;

/**
 *  泛型类
 *
 * 1. 在实例化反省类的时候需要指定泛型类型
 * 2. 如果在实例化的时候不指定泛型类型 那么泛型可以是任意类型
 * 3. 泛型只能是类类型
 *
 * */
public class GenericsClass<T> {

    private T t;

    public GenericsClass(T t){
        this.t = t;
    }

    public GenericsClass(){

    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsClass genericsClass1 = new GenericsClass();
        genericsClass1.setT("123456");
        System.out.println(" 在创建对象时不指定泛型 --  " + genericsClass1.getT().getClass().getName() );
        Object t = genericsClass1.getT();

        genericsClass1.setT(false);
        System.out.println(" 在创建对象时不指定泛型  重新赋值后  --  " + genericsClass1.getT().getClass().getName() );

        GenericsClass<String> genericsClass2 = new GenericsClass<String>("123456");
        System.out.println(" 在创建对象时   指定泛型 --  " + genericsClass2.getT().getClass().getName() );
        String t1 = genericsClass2.getT();

//        genericsClass2.setT(false);  // 编译报错
//        System.out.println(" 在创建对象时   指定泛型  并且重新赋值 --  " + genericsClass2.getT().getClass().getName() );

//        初始化时不指定泛型类型  但是在构造方法处指定了类型
//        这种情况并使得泛型固定为Object
        GenericsClass genericsClass3 = new GenericsClass("123456");
        System.out.println(" genericsClass3 --  " + genericsClass3.getT().getClass().getName() );
        genericsClass3.setT(false);
        System.out.println(" genericsClass3 --  " + genericsClass3.getT().getClass().getName() );
        Object t2 = genericsClass3.getT();
    }
}
