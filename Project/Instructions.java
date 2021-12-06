import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    public Instructions() 
    {
        GreenfootImage InstructionButton=new GreenfootImage(280,60);
        Font changeFont=new Font(true,false,40);
        InstructionButton.setFont(changeFont);
        InstructionButton.setColor(Color.WHITE);
        InstructionButton.drawString("Instructions",0,50);
        setImage(InstructionButton);
    }    
    
    public void act(){
        MouseOverSomething();
        checkClick(new InstructionsMenu());
    }  
}
