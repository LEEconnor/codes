package com.plums.base.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericesMethod {

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


class GenericesMethodTest {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        System.out.println(GenericesMethod.<Integer, String>compare(p1, p2));
    }
}


/**
 * 泛型的统配
 */
class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}


class GenericReading {
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f1() {
        Reader<Fruit> fruitReader = new Reader<Fruit>();
        // Errors: List<Fruit> cannot be applied to List<Apple>.
        // Fruit f = fruitReader.readExact(apples);
    }

    static void f2() {
        CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
        Fruit f = fruitReader.readCovariant(fruit);
        Fruit a = fruitReader.readCovariant(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
    }

}


/**
 *  泛型的extends 和 super
 * */
class GenericsAndCovariance {
    public static void main(String[] args) {



        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Fruit());
//        flist.add(new Apple());

        List<Fruit> flist1 = new ArrayList<Fruit>();
        flist1.add(new Apple());

    }
}

class GenericWriting {
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruit, new Apple());
    }
    static <T> void writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }
    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruit, new Apple());
    }
    public static void main(String[] args) {
        f1(); f2();
    }
}



//因为super和extends的限制，因此很多源码都组合使用 super和Extends
//
//public class Collections {
//    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
//        for (int i=0; i<src.size(); i++)
//            dest.set(i, src.get(i));
//    }
//}