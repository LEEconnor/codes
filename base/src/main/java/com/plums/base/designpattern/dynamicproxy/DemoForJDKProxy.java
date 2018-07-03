package com.plums.base.designpattern.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface DemoForJDKProxy {
    public void doSomeThing();
}

class JDKTarget implements DemoForJDKProxy {

    @Override
    public void doSomeThing() {
        System.out.println("doSomeThings");
    }
}

class InvocationHandlerImpl implements InvocationHandler {

    private JDKTarget jdkTarget;

    public InvocationHandlerImpl(JDKTarget jdkTarget){
        this.jdkTarget = jdkTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        if (method.getName().equals("doSomeThing")) {
            System.out.println(" -- pre ");
            result = method.invoke(jdkTarget, args);
            System.out.println(" -- end ");
        }
        return result;

    }
}

class JDKProxyTest {
    public static void main(String[] args) {
        DemoForJDKProxy instance = (DemoForJDKProxy) Proxy.newProxyInstance(DemoForJDKProxy.class.getClassLoader(), new Class[]{DemoForJDKProxy.class}, new InvocationHandlerImpl(new JDKTarget()));
        instance.doSomeThing();
    }

}