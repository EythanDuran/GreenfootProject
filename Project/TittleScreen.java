import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TittleScreen extends World
{
    GreenfootSound soundtrack=new GreenfootSound("TitleMusic.mp3");;

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

        RecordManager recordManager = new RecordManager(5,"archivo.txt");
        Record record = new Record("",0);

        Play start = new Play(recordManager,record,soundtrack);
        addObject(start,320,200);

        Instructions instructions = new Instructions(soundtrack);
        addObject(instructions,334,254);

        Records recordLevel=new Records(recordManager,soundtrack);
        addObject(recordLevel,370,304);

    }

    public void act(){
        this.soundtrack.play();
    }

}
