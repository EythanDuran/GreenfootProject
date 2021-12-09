import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{

    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    void prepare(){
       GreenfootImage image =new GreenfootImage("gameover.jpg");
     Background imageBackground= new Background(image);
     addObject(imageBackground,getWidth()/2,200);
     
     
     
    }   
}

