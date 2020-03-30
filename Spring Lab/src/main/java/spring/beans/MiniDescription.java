package spring.beans;

import spring.services.LoggingService;

public class MiniDescription {
    private Integer miniId;
    private String species;
    private String clothes;
    private String items;

    private LoggingService loggingService;

    //constructors
    public MiniDescription(){}
    public MiniDescription(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    //getters and setters
    public void setMiniId(Integer miniId){
        this.miniId = miniId;
    }
    public Integer getMiniId(){
        return miniId;
    }

    public void setSpecies(String species){
        this.species = species;
    }
    public String getSpecies(){
        return species;
    }

    public void setClothes(String clothes){
        this.clothes = clothes;
    }
    public String getClothes(){
        return clothes;
    }

    public void setItems(String items){
        this.items = items;
    }
    public String getItems(){
        return items;
    }

    //set logging service
    public void setLoggingService(LoggingService loggingService){
        this.loggingService = loggingService;
    }

    public void useLoggingService(){
        System.out.println(loggingService.confirmMini());
    }
}
