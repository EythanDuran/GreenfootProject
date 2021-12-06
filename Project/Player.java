import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int fear;
    private int maximumFear;
    
    public Player(){
     maximumFear=10;
     fear=maximumFear;
    }
    
    public int getFear(){
        return fear;
    }
    
    public void setFear(int fear){
     this.fear=fear;   
    }
    
    public double getFearStatus(){
     return (double)fear/maximumFear;   
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
