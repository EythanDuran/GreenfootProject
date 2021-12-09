import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TittleScreen extends World
{
    private static GreenfootSound soundtrack=new GreenfootSound("TitleMusic.mp3");
    
    public TittleScreen()
    {    
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
        
        Play start = new Play();
        addObject(start,320,200);

        Instructions instructions = new Instructions();
        addObject(instructions,334,254);

        Records record=new Records();
        addObject(record,370,304);
    }
    
    public static void startMusic(){
     soundtrack.play();   
    }
    
    public static void stopMusic(){
     soundtrack.stop();   
    }
}
