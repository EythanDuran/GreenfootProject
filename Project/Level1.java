import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    public Level1()
    {    
        super(600, 400, 1,false); 
        prepare();
        randomGeneration();
    }
    
    void prepare(){
       GreenfootImage image =new GreenfootImage("Level1.png");
       Background imageBackground= new Background(image);
       addObject(imageBackground,getWidth()/2,200);
        
       Player player=new Player();
       FearBar fearBar=new FearBar(100,20,player);
       addObject(fearBar,60,390);
    }
    
    public void randomGeneration(){
        for(int i=0;i<5;i++){
         int x=Greenfoot.getRandomNumber(getWidth()-1);
         int y=Greenfoot.getRandomNumber(getHeight()-1);
         addObject(new Monster(this),x,y);
        }
    }
    
    
}
