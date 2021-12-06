import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private boolean mouseOver=false;
    private static int maxTransparency=255;
    
    public void MouseOverSomething() 
    {
        if(Greenfoot.mouseMoved(null))
        {
         mouseOver=Greenfoot.mouseMoved(this);
        }
        if(mouseOver)
        {
         changeTransparency(maxTransparency/2);
         }else{
            changeTransparency(maxTransparency);
         }
    }    
    
    public void changeTransparency(int change){
     GreenfootImage tempImage=getImage();
     tempImage.setTransparency(change);
     setImage(tempImage);
    }
    
    public void checkClick(World world){
     MouseOverSomething();
     
        if(Greenfoot.mouseClicked(this)){
         Greenfoot.setWorld(world);     
        }
    }
}
