package com.plums.base.log;

public class Log4jLogChangeFactory implements ILogChangeFactory {

    private ILogLevelChange log4j;

    public Log4jLogChangeFactory(){
        this.log4j = new Log4jLevelChange();
    }

    @Override
    public ILogLevelChange getProduct() {
        return log4j ;
    }
}
