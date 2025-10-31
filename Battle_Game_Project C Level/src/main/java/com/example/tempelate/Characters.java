package com.example.tempelate;

import java.util.ArrayList;

public class Characters {
    private int health;
    private String name;
    private int accuracy;
    private int firepower;
    private int awareness;
    private int leadership;
    private int level=0;
    private int speed;
    private String specialty;
    private Weapons weapon;
    public Characters(String name, String speciality){
        this.name=name;
        this.specialty=speciality;
        if (speciality.equals("sharpshooter")){
            health=50;
            accuracy=95;
            firepower=80;
            awareness=60;
            leadership=20;
            speed=10;
        }
        if (speciality.equals("brute")){
            health=100;
            accuracy=45;
            firepower=80;
            awareness=10;
            leadership=40;
            speed=20;
        }
        if (speciality.equals("brick")){
            health=300;
            accuracy=10;
            firepower=30;
            awareness=1;
            leadership=1;
            speed=1;

        }
        if (speciality.equals("veteran")){
            health=70;
            accuracy=90;
            firepower=50;
            awareness=90;
            leadership=90;
            speed=78;

        }
        if (speciality.equals("leader")){
            health=40;
            accuracy=50;
            firepower=50;
            awareness=100;
            leadership=100;
            speed=60;

        }
        if (speciality.equals("skitzo john")){
            health=100;
            accuracy=100;
            firepower=100;
            awareness=100;
            leadership=100;
            speed=100;

        }
        if (speciality.equals("weak")){
            health=30;
            accuracy=30;
            firepower=30;
            awareness=30;
            leadership=30;
            speed=10;

        }
        if (speciality.equals("mid")){
            health=60;
            accuracy=60;
            firepower=70;
            awareness=60;
            leadership=60;
            speed=30;

        }
        if (speciality.equals("strong")){
            health=90;
            accuracy=90;
            firepower=90;
            awareness=90;
            leadership=90;
            speed=70;

        }
        if (speciality.equals("boss")){
            health=100;
            accuracy=100;
            firepower=100;
            awareness=100;
            leadership=100;
            speed=100;

        }


    }

    public int gethealth(){
        return health;
    }
    public boolean areyoualive(){
        if (health>0){
            return true;
        }else{
            return false;
        }
    }
    public String getname(){
        return name;
    }
    public int getaccuracy(){
        return accuracy;
    }
    public int getfirepower(){
        return firepower;
    }
    public int getawareness(){
        return awareness;
    }
    public int getleadership(){
        return leadership;
    }
    public int getlevel(){
        return level;
    }
    public void levelup(){
        level+=1;
        awareness+=1;
        accuracy+=1;
        firepower+=1;
        leadership+=1;
    }
    public Weapons getweapon(){
        return weapon;
    }
    public String getspecialty(){
        return specialty;
    }
    public int getspeed(){
        return speed;
    }
    public void makeweapon(String name,String type,int range,int power,int skill){
        weapon=new Weapons(name,type,range,power,skill);
    }
    public void damage(int num){
        health-=num;
    }




}
