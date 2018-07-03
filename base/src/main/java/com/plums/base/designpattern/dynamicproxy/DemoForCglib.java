package com.plums.base.designpattern.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DemoForCglib {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibTarget.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method interceptedMethod, Object[] interceptedMethodAergs, MethodProxy methodProxy) throws Throwable {
                System.out.println("before");
                methodProxy.invokeSuper(proxy,interceptedMethodAergs);
                System.out.println("behind");
                return null;
            }
        });
        CglibTarget o = (CglibTarget)enhancer.create();
        o.doSomething();
    }

}


class CglibTarget{
    public void doSomething(){
        System.out.println("-- do someThings --");
    }
}

