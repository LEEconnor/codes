package com.plums.base.log;

import org.slf4j.event.Level;
import org.apache.log4j.LogManager;

import java.util.Enumeration;

/**
 * log4j修改日志级别方法
 * */
public class Log4jLevelChange implements ILogLevelChange{

    @Override
    public Boolean changeLevel(Level level) {
        Enumeration enumeration = LogManager.getCurrentLoggers();
        while (enumeration.hasMoreElements()){
            org.apache.log4j.Logger logger = (org.apache.log4j.Logger) enumeration.nextElement();
            logger.setLevel(org.apache.log4j.Level.toLevel(level.toString()));
        }
        return true;
    }
}
