package com.plums.base.log;

public enum LogTypeEnum {
    LOG4J("Log4j",1), LOGBACK("LogBack",2);


    private String logType;
    private Integer logTypeId;

    LogTypeEnum(String logType, Integer logTypeId) {
        this.logType = logType;
        this.logTypeId = logTypeId;
    }

    public Integer getLogTypeId() {
        return logTypeId;
    }

    public String getLogType() {
        return logType;
    }

    public static Boolean containsValue(String type) {
        for (LogTypeEnum mccEnum : LogTypeEnum.values()) {
           if(type.equals(mccEnum.logType)){
               return true;
           }
        }
        return false;
    }

}
