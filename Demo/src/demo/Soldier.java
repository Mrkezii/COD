/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author davidkezi
 */
public class Soldier {
    private int lives;
    private int hitpoints;
    private int damage;
    
      
    
    //lives.setlives(4);
    public int getlives(){
        return lives;
    }
    public int gethitpoints(){
    return hitpoints;
    }
    public Soldier(int lives, int hitpoints){
        this.lives=lives;
        this.hitpoints=hitpoints;
        
    }
    
    public void setlives(int lives){
        this.lives=lives;
    }
    public void sethitpoints(int hitpoints){
        this.hitpoints=hitpoints;
    }
    
    public int damage(int newHitpoint){
        
        int remainingHitpoints = gethitpoints()- damage;
        return remainingHitpoints;
    }
    
}
