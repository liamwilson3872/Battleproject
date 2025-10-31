package com.example.tempelate;

public class Weapons {
    private String name;
    private String type;
    private int range;
    private int power;

    public Weapons(String name,String type,int range,int power, int skill){
        this.name=name;
        this.type=type;
        this.range=range;
        this.power=power;
    }

    public String getname(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getrange(){
        return range;
    }
    public int getpower(){
        return power;
    }


}
