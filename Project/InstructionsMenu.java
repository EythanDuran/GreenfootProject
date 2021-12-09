import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionsMenu extends World
{
    public InstructionsMenu()
    {    
        super(600, 400, 1); 
        prepare();
    }
    
    void prepare(){
     GreenfootImage image =new GreenfootImage("forText.jpg");
       Background imageBackground= new Background(image);
       addObject(imageBackground,getWidth()/2,210); 
        
       GreenfootImage text =new GreenfootImage("howtoplay.png");
       Background textBackground= new Background(text);
       addObject(textBackground,getWidth()/2,210); 
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TittleScreen());
        }
    }
    
}
