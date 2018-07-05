package com.plums.base.log;

import org.slf4j.event.Level;

/**
 * 抽象各个日志框架的修改
 * */
public interface ILogLevelChange {
    public Boolean changeLevel(Level level);
}
