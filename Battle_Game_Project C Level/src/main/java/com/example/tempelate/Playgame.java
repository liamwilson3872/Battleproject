package com.example.tempelate;

import java.util.ArrayList;

public class Playgame {
    private Characters characters;
    private Characters enemy;
    private Team enemys;
    private Team team;
    private int turn;
    private int maxturn;
    private ArrayList<Characters> turnorder=new ArrayList<>();
    private ArrayList<Characters> sortingorder=new ArrayList<>();

    public Playgame(){
        team=new Team();
        enemys=new Team();
        turn=0;
        maxturn=1;

    }

    public void makeplayer(String name,String speciality){
        characters =new Characters(name,speciality);
        team.addteam(characters);
        maxturn=team.getteamlength()-1+enemys.getteamlength()-1;
        turnorder.add(characters);

    }
    public void makeenemy(String name,String speciality){
        characters =new Characters(name,speciality);
        enemys.addteam(characters);
        maxturn=team.getteamlength()-1+enemys.getteamlength()-1;
        turnorder.add(characters);

    }
    public Characters getteammate(int index){
        return team.getcharacter(index);
    }
    public Characters getenemy(int index){
        return enemys.getcharacter(index);
    }


    public int calcdamage(){
        return turnorder.get(0).getfirepower()+turnorder.get(0).getweapon().getpower();
    }

    public void changeturn(){
        turn+=1;
        if (turn>maxturn){
            turn=0;
        }
    }


    public void maketurnorder(){

//
//        for(int i=0;i<team.getteamlength();i++){
//            sortingorder.add(team.getcharacter(i));
//        }
//        for(int i=0;i<enemys.getteamlength();i++){
//            sortingorder.add(enemys.getcharacter(i));
//        }
//        int temp=0;
//        for(int i=0;i<sortingorder.size();i++){
//            for(int j=0;i<sortingorder.size();i++){
//                if ()
//            }
//        }


    }

    public void battlestart(){
        maketurnorder();



    }
    public int findinexoftarget(String whotoattack){
        for(int i=0;i<enemys.getteamlength();i++){
            if (enemys.getcharacter(i).getname().equals(whotoattack)){
                return i;
            }
        }
        return -1;
    }



    public void attack(String whotoattack){
        int damage=calcdamage();
        int index=findinexoftarget(whotoattack);

        enemys.getcharacter(index).damage(damage);
        if (enemys.getcharacter(index).areyoualive()==false){
            enemys.killteammember(index);
            System.out.println("died");
        }else {
            System.out.println(damage);
            System.out.println(enemys.getcharacter(index).gethealth());
        }
        turnorder.add(turnorder.get(0));
        turnorder.remove(0);

    }

    public void enemyattack(String whotoattack){
        int damage=calcdamage();
        int index=0;
        System.out.println(index);
    }







}
