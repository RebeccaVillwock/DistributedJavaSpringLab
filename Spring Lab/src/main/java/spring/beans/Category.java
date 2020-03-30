package spring.beans;

import spring.services.LoggingService;

public class Category {
    private Integer categoryId;
    private String name;

    private LoggingService loggingService;

    //constructors
    public Category(){}
    public Category(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    //getters and setters
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public Integer getCategoryId(){
        return categoryId;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //set logging service
    public void setLoggingService(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    public void useLoggingService(){
        System.out.println(loggingService.confirmMini());
    }
}
