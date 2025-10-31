package com.example.tempelate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    public Button btnclick;
    public Label lbldisplay;
    public TextField txtinput;
    public TextArea battleLog;
    public Button attackButton;
    public Button magicButton;
    public Button defendButton;
    public Button itemButton;
    public Button runButton;
    public Label turnLabel;
    public Button negotiationbutton;
    public TextField txtCommand;
    public Button btnCommand;
    public ProgressBar enemyHPBar;
    public Label enemyName;
    public ListView inventoryList;
    public Label playerLevel;
    public Label hptxt;
    private int count=0;
    private Playgame game;
    private String speciality;
    private String name;
    private int attackcount=0;

    public void initialize(){
        battleLog.appendText("hello, please choose what class you are. sharpshooter,  brute, leader, veteran, or brick.");
        game=new Playgame();

    }

    public void btnclick(ActionEvent actionEvent) {
        System.out.println("click");
    }

    

    public void handleDefend(ActionEvent actionEvent) {
    }

    public void handleUseItem(ActionEvent actionEvent) {
    }

    public void handleRun(ActionEvent actionEvent) {
    }

    public void handleCommand(ActionEvent actionEvent) {
        if (count==0){
            speciality=txtCommand.getText();
            count+=1;
            battleLog.clear();
            battleLog.appendText("now type your name"+"\n");

        }else if (count==1){
            name=txtCommand.getText();
            count+=1;
            game.makeplayer(name,speciality);
            System.out.println(game.getteammate(0).getspecialty());
            System.out.println(game.getteammate(0).getname());
            battleLog.appendText("Your name is "+game.getteammate(0).getname()+" and your class is "+game.getteammate(0).getspecialty()+"\n");
        }else if (count>1){
            battleLog.appendText("you wake up in a large field...you see your crashed f-15 jet next to you covered in dents and damage..."+"\n");
            battleLog.appendText("You see your trusty weapon on the ground next to you. you pcik it up "+"\n");
            game.getteammate(0).makeweapon("revolver","pistol",50,30,10);
            inventoryList.getItems().add("revolver");
            battleLog.appendText("You now own a revolver here are it stats. name: "+game.getteammate(0).getweapon().getname()+" its stats are 50 range, 30 power, and 10 skill"+"\n");
            battleLog.appendText("a tall figure apears in front of you. it looks like some sort of blob. it begins rushing towards you. select what to do"+"\n");
            game.makeenemy("glob","brute");
            setenemystats(game.findinexoftarget("glob"));
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");
            game.enemyattack("person");

        }



    }

    public void handleAttack(ActionEvent actionEvent) {
        game.attack(txtCommand.getText());
        setenemystats(game.findinexoftarget(txtCommand.getText()));
    }

    public void Negotiate(ActionEvent actionEvent) {
    }
    public void setenemystats(int index){
        if (game.getenemy(index).areyoualive()==true) {
            enemyName.setText(game.getenemy(index).getname());
            hptxt.setText(String.valueOf(game.getenemy(index).gethealth()));
        }else{
            enemyName.setText("Dead ");
            hptxt.setText("0");
        }

    }
}