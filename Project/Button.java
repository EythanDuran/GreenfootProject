import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean mouseOver=false;
    private static final int MAX_TRANSPARENCY=255;
    
    public void mouseOverSomething() 
    {
        if(Greenfoot.mouseMoved(null))
        {
         mouseOver=Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
         changeTransparency(MAX_TRANSPARENCY/2);
        }
          else{
          changeTransparency(MAX_TRANSPARENCY);
          }
    }    
    
    public void changeTransparency(int change){
     GreenfootImage tempImage=getImage();
     tempImage.setTransparency(change);
     setImage(tempImage);
    }
    
    public void checkClick(World world){
     mouseOverSomething();
     
     if(Greenfoot.mouseClicked(this))
     {
        Greenfoot.setWorld(world);     
     }
    }
}
