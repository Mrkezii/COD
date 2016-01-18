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
public class player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    
    
    
    public int getlives(){
        return lives;
    }
    
    public void setlives(int lives){
this.lives = lives;

}
    public String gethandleName(){
        return handleName;
    }
    public void sethandleName(String handleName){
        this.handleName=handleName;
    }
    public void setlevel(int setlevel){
        this.level=level;
    }
    public int getlevel(){
        return level;
    }
    public void setscore(int score){
        this.score=score;
    }
    public int getscore(){
        return score;
    }
    //Constructors
    public player(String handleName){
        this.handleName=handleName;
        
    }
    public player(int lives){
        this.lives=lives;
        
    }
    public player(int score,int level){
        this.score=score;
        this.level=level;
    }
}
