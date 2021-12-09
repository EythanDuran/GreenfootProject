import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class RecordsScreen extends World
{
    public RecordsScreen()
    {    
        super(600, 400, 1); 
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TittleScreen());
        }
    }
    
    
}
