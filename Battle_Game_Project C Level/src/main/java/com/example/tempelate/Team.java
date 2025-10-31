package com.example.tempelate;

import java.util.ArrayList;

public class Team {
    private ArrayList<Characters> team =new ArrayList<>();

    public Team(){

    }
    public void addteam(Characters newteammember){
        team.add(newteammember);
    }
    public Characters getcharacter(int index){
        return team.get(index);
    }
    public int getteamlength(){
        return team.size();
    }

    public ArrayList<Characters> getteam(){
        return team;
    }
    public void killteammember(int index){
        team.remove(index);
    }




}
