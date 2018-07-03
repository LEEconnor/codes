//0.使用
    //CGLIB使用target作为父类

//1.回调
    //使用MethodInterceptor来实现回调
    //public Object intercept(Object object, java.lang.reflect.Method method, Object[] args, MethodProxy proxy) throws Throwable;
    //MethodInterceptor.intercept方法的第一个参数是代理对象，第二个、第三个参数分别是被拦截的方法和方法的参数。
    //如果想调用被代理对象的原始方法，可以通过使用java.lang.reflect.Method对象来反射调用，或者使用net.sf.cglib.proxy.MethodProxy对象。
    //我们通常使用net.sf.cglib.proxy.MethodProxy因为它更快。

//2. 替他形式回调
    //net.sf.cglib.proxy.MethodInterceptor满足了所有的代理需求，但对于某些特定场景它可能使用起来不太方便。为了方便使用和高性能，CGLIB提供了另外一些特殊的回调类型。例如，
    //
    //        net.sf.cglib.proxy.FixedValue：在强制一个特定方法返回固定值，在特定场景下非常有用且性能高。
    //        net.sf.cglib.proxy.NoOp：它直接透传到父类的方法实现。
    //        net.sf.cglib.proxy.LazyLoader：在被代理对象需要懒加载场景下非常有用，如果被代理对象加载完成，那么在以后的代理调用时会重复使用。
    //        net.sf.cglib.proxy.Dispatcher：与net.sf.cglib.proxy.LazyLoader差不多，但每次调用代理方法时都会调用loadObject方法来加载被代理对象。
    //        net.sf.cglib.proxy.ProxyRefDispatcher：与Dispatcher相同，但它的loadObject方法支持传入代理对象。


package com.plums.base.designpattern.dynamicproxy;
