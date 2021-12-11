import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{   RecordManager recordManager;
    Record record;
    GreenfootSound soundtrack;

    public Play(RecordManager recordManager,Record record,GreenfootSound soundtrack) 
    {
        GreenfootImage playButton=new GreenfootImage(110,60);
        Font changeFont=new Font(true,false,40);
        playButton.setFont(changeFont); 
        playButton.setColor(Color.WHITE);
        playButton.drawString("Play",0,50);
        setImage(playButton);

        this.soundtrack=soundtrack;
        this.recordManager = recordManager;
        this.record=record;
    }    

    public void clicked(){
        Greenfoot.setWorld(new Level(recordManager,record, soundtrack));
    }  
}

