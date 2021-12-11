import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionsMenu extends World
{
    GreenfootSound soundtrack;

    public InstructionsMenu(GreenfootSound soundtrack)
    {    
        super(600, 400, 1); 
        prepare();
        this.soundtrack=soundtrack;
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
            soundtrack.stop();
            Greenfoot.setWorld(new TittleScreen());
        }
    }

}
