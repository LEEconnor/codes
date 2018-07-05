package com.plums.base.log;

public class LogBackLogChangeFactory implements ILogChangeFactory{

    private ILogLevelChange logBackLogChange;

    public LogBackLogChangeFactory(){
        this.logBackLogChange = new LogBackLevelChange();
    }

    @Override
    public ILogLevelChange getProduct() {
        return logBackLogChange;
    }
}
