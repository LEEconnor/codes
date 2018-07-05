package com.plums.base.log;

import org.slf4j.event.Level;

/**
 * 动态修改日志级别
 */
public class DynamicLog {

    public static void main(String[] args) {
        String logtype = "Log4j";
        Level logLevel = Level.ERROR;
        try {
            if (LogTypeEnum.containsValue(logtype)) {
                ILogChangeFactory o = (ILogChangeFactory) Class.forName(ILogChangeFactory.class.getPackage().getName() + "." + logtype + "LogChangeFactory").newInstance();
                o.getProduct().changeLevel(logLevel);
                System.out.println("end");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
