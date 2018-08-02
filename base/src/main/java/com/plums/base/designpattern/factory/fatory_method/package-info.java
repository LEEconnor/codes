/**
 * 工厂方法模式
 * 定义了一个创建对象的接口，但由子类决定要实例化的类时哪个，工厂方法让类吧实例化推迟到子类
 *
 * 依赖倒置 ：要依赖抽象、不要依赖具体类
 *      实现依赖倒置：
 *          1.变量不可以持有具体的类的引用
 *          2.不要让类派生自具体的类
 *          3.不要覆盖基类中已经实现的方法
 */
package com.plums.base.designpattern.factory.fatory_method;