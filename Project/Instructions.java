import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Button
{
    public Instructions() 
    {
        GreenfootImage instructionButton=new GreenfootImage(280,60);
        Font changeFont=new Font(true,false,40);
        instructionButton.setFont(changeFont);
        instructionButton.setColor(Color.WHITE);
        instructionButton.drawString("Instructions",0,50);
        setImage(instructionButton);
    }    
    
    public void act(){
        mouseOverSomething();
        checkClick(new InstructionsMenu());
    }  
    
}
