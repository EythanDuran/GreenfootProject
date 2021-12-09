import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    public Play() 
    {
        GreenfootImage playButton=new GreenfootImage(110,60);
        Font changeFont=new Font(true,false,40);
        playButton.setFont(changeFont); 
        playButton.setColor(Color.WHITE);
        playButton.drawString("Play",0,50);
        setImage(playButton);
    }    
    
    public void act(){
        mouseOverSomething();
        checkClick(new Level());
    }
 }

