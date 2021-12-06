 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    private int damage;
    private int xScreenlimit;
    private int yScreenlimit;
    private int speedx=-2;
    private int speedy=2;
    
    public Monster(World screen){
     damage=5;
     xScreenlimit=screen.getWidth()-1;
     yScreenlimit=screen.getHeight()-1;
    }
    
    public void act() 
    { 
       monsterMovement();
       deleteMonster();
    }  
    
    public void monsterMovement(){
       int x=getX();
       int y=getY();

       if(x<10){
         speedx=Greenfoot.getRandomNumber(5)+2;  
         getImage().mirrorHorizontally();
       }
        
       if(x>xScreenlimit){
           speedx=(Greenfoot.getRandomNumber(5)+2)*-1; 
       }
        
       if(y<10){
         speedy=(Greenfoot.getRandomNumber(5)+2); 
       }
       
       if(y>yScreenlimit){
          speedy=(Greenfoot.getRandomNumber(5)+2)*-1; 
       }
       
       setLocation(x+speedx,y+speedy);
    }
    
    public void deleteMonster(){
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
        }
    }
}

    
    
