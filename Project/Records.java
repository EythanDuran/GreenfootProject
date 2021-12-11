import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Records extends Button
{
    private RecordManager recordManager;
    GreenfootSound soundtrack;

    public Records(RecordManager recordManager,GreenfootSound soundtrack) 
    {
        GreenfootImage recordButton=new GreenfootImage(280,60);
        Font changeFont=new Font(true,false,40);
        recordButton.setFont(changeFont);
        recordButton.setColor(Color.WHITE);
        recordButton.drawString("Records",0,50);
        setImage(recordButton);
        
        this.recordManager = recordManager;
        this.soundtrack=soundtrack;
    }    

    public void clicked(){
        Greenfoot.setWorld(new RecordsScreen(recordManager,soundtrack));
    }    
}
