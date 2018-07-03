package com.plums.base.annotation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.ObjectUtils;

import javax.validation.constraints.NotNull;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.*;


@Retention(RetentionPolicy.RUNTIME) // 表示生命周期 Runtime生命周期最久，运行时仍可用；SOURCE最短，只在源码期有效，编译时丢弃；class在编译期有效，运行时丢弃；
@Target({ElementType.METHOD, ElementType.TYPE}) // 注解可以使用于哪 :
//@Inherited  // 该注解可以被子类继承 ： 父类使用了该注解，子类没有显式标注的情况下 也会自动使用此注解
@Repeatable(Persons.class)
@interface Person {
    String value() default ""; // 可以使用value来自动简化对其属性的赋值
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Persons {
    Person[] value();
}


@Person("artist")
@Person("coder")
@Person("PM")
class SuperMan {

}


// 声明一个在前后打印日志的注解
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface PrintLogAtStartAndEnd {

    String startMsg() default "start";

    String endMsg() default "end";

}

public class Annotation {

    public static void main(String[] args) {

        PrintName printNamerintName = null;
        try {
            printNamerintName = (PrintName) Test.getBean(PrintName.class.getName());
            printNamerintName.getName();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException --- ");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException --- ");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException --- ");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException --- ");
        }
    }

}

/**
 * 测试
 */
class PrintName {

    @PrintLogAtStartAndEnd(startMsg = "this is method begin ",endMsg = "this is method end")
    public void getName() {
        String firstName = "LEE";
        String lastName = "plums";
        String fullName = firstName + lastName;
        System.out.println(fullName);
    }

}

class Test {

    private static Map<String, Object> beanMap = new HashMap<String, Object>();

    public static Object getBean(@NotNull String beanName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        if (!beanMap.containsKey(beanName)) {
            Class<?> aClass = Class.forName(beanName);
            Enhancer enhancer = initClaz(aClass);
            beanMap.put(beanName, enhancer.create());
        }

        return beanMap.get(beanName);
    }

    private static Enhancer initClaz(Class<?> claz) throws NoSuchFieldException, IllegalAccessException, InstantiationException {

        //  1. 通过反射获取该beanName的claz文件
        //  2. 获取标注了printLogAtStartAndEnd的方法
        //  3. 创建代理对象并返回代理对象的claz对象

        Log log = LogFactory.getLog(claz);
        // 使用创建代理对象
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(claz);
        List<Callback> callbacks = new ArrayList<Callback>();

        Method[] methods = claz.getMethods();
        for (Method method : methods) {
            PrintLogAtStartAndEnd annotation = method.getAnnotation(PrintLogAtStartAndEnd.class);
            if (!ObjectUtils.isEmpty(annotation)) {
                String startMsg = annotation.startMsg();
                String endMsg = annotation.endMsg();
                callbacks.add(new MethodInterceptor() {

//                    Object为由CGLib动态生成的代理类实例，Method为上文中实体类所调用的被代理的方法引用，Object[]为参数值列表，MethodProxy为生成的代理类对方法的代理引用。
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        log.info(startMsg);
                        Object result = methodProxy.invokeSuper(o, objects);
                        log.info(endMsg);
                        return result;
                    }
                });
            }
        }
        Callback[] callbackArry = new Callback[callbacks.size()];
        callbacks.toArray(callbackArry);
        enhancer.setCallbacks(callbackArry);
        // 返回代理对象
        return enhancer;
    }


}