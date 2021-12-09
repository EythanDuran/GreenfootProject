import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Records extends Button
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
        mouseOverSomething();
        checkClick(new RecordsScreen());
    }    
}
