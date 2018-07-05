package com.plums.base.log;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;


import java.util.List;
/**
 * logback修改日志级别方法
 * */
public class LogBackLevelChange implements ILogLevelChange {

    @Override
    public Boolean changeLevel(Level level) {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        //获取应用中的所有logger实例
        List<Logger> loggerList = loggerContext.getLoggerList();

        //遍历更改每个logger实例的级别,可以通过http请求传递参数进行动态配置
        for (Logger logger:loggerList){
            logger.setLevel(ch.qos.logback.classic.Level.toLevel(level.toString()));
        }

        return true;
    }
}
