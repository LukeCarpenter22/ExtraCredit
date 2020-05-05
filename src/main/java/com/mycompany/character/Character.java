/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.character;



/**
 *
 * @author Luke
 */
public class Character {
    //this will be a class for a basketball player for a basketball game
    
    //user can choose a name for their player
    String name;
    
    //user can choose their players jersey number
    String jerseyNumber;
    
    //the players rating on offense
    int offense;
    
    //the players rating on defense
    int defense;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getOffense() {
        return offense;
    }

    public void setOffense(int offense) {
        this.offense = offense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    //players offense and defense stats start at 0 until the character levels up
    public Character() {
        name = "";
        jerseyNumber = "";
        offense = 0;
        defense = 0;
    }
    public Character(String name, String jerseyNumber, int offense, int defense) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.offense = offense;
        this.defense = defense;
    }
    //if the user decides to level up his players offensive skill it will increase by 5
    public void offenseLevelUp() {
        offense = offense+5;
        
    }
    //if the user decides to level up his players defensive skill it will increase by 5
    public void defenseLevelUp() {
        defense = defense+5;
    }
    
}
