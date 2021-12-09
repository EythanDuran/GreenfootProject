import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int fear;
    private int maximumFear;
    
    public Player(){
     maximumFear=30;
     fear=maximumFear;
    }
    
    public double getFearStatus(){
     return (double)fear/maximumFear;   
    }
    
    public void damagePlayer(int damage){
        fear-=damage;
        
        if(fear<=0){
         Greenfoot.stop();
         TittleScreen.stopMusic();
         Greenfoot.setWorld(new GameOver());
        }  
    }
}
