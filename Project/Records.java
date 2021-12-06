import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends Buttons
{
   public Records() 
    {
        GreenfootImage recordButton=new GreenfootImage(280,60);
        Font changeFont=new Font(true,false,40);
        recordButton.setFont(changeFont);
        recordButton.setColor(Color.WHITE);
        recordButton.drawString("Records",0,50);
        setImage(recordButton);
    }    
    
    public void act(){
        MouseOverSomething();
        checkClick(new InstructionsMenu());
    }    
}
