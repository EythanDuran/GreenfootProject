import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World
{
    private Record record;
    private RecordManager recordManager;
    GreenfootSound soundtrack;

    public GameOver(Record record,RecordManager recordManager,GreenfootSound soundtrack)
    {    
        super(600, 400, 1); 
        prepare();
        this.record=record;
        this.recordManager=recordManager;
        this.soundtrack= soundtrack;
        soundtrack=new GreenfootSound("TitleMusic.mp3");

    }

    void prepare(){
        GreenfootImage image =new GreenfootImage("gameover.jpg");
        Background imageBackground= new Background(image);
        addObject(imageBackground,getWidth()/2,200);

    }

    public void act(){
        String playerName = "";
        while(record.getPlayer().equals(""))
        {
            playerName = Greenfoot.ask("Cual es tu nombre?");
            record.setPlayer(playerName);
        }
        
        recordManager.save(record);
        soundtrack.stop();
        Greenfoot.setWorld(new TittleScreen());
    }
}
