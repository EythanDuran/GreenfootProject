import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TittleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TittleScreen extends World
{
    private GreenfootSound soundtrack=new GreenfootSound("TitleMusic.mp3");
    
    public TittleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    private void prepare(){
        GreenfootImage image =new GreenfootImage("tittleScreen1.png");
        Background imageBackground= new Background(image);
        addObject(imageBackground,getWidth()/2,200);

        GreenfootImage image2 =new GreenfootImage("Title.png");
        Background title= new Background(image2);
        addObject(title,getWidth()/2,100);

        
        Start start = new Start();
        addObject(start,320,200);

        Instructions instructions = new Instructions();
        addObject(instructions,334,254);

        Records record=new Records();
        addObject(record,370,304);

        
    }
    
    public void startMusic(){
     soundtrack.play();   
    }
    
    public void stopMusic(){
     soundtrack.stop();   
    }
}
