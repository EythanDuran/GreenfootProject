import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Buttons
{
    public Start() 
    {
        GreenfootImage playButton=new GreenfootImage(110,60);
        Font changeFont=new Font(true,false,40);
        playButton.setFont(changeFont); 
        playButton.setColor(Color.WHITE);
        playButton.drawString("Play",0,50);
        setImage(playButton);
    }    
    
    public void act(){
        MouseOverSomething();
        checkClick(new Level1());
    }
 }

