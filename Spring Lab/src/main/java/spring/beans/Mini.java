package spring.beans;

import spring.services.LoggingService;

public class Mini {
    private Integer miniId;
    private String name;
    private String description;

    private LoggingService loggingService;

    //Constructors
    public Mini(){}
    public Mini(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    //getters and setters
    public void setMiniId(Integer miniId){
        this.miniId = miniId;
    }
    public Integer getMiniId(){
        return miniId;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }

    //set logging service
    public void setLoggingService(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    public String getLoggingService(){
        return loggingService.confirmMini();
    }
}
