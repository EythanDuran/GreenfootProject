import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.util.List;

public class RecordsScreen extends World
{
    GreenfootSound soundtrack;

    public RecordsScreen(RecordManager recordManager,GreenfootSound soundtrack)
    {    
        super(600, 400, 1);
        this.soundtrack=soundtrack;

        List<Record> listaRecords = recordManager.getRecords();
        int i = 1;
        for(Record record:listaRecords){
            String recordName = "nombre: "+record.getPlayer() + " puntuacion: " + Integer.toString(record.getScore());
            this.showText(recordName,200,50 * i);
            i++;
        }

    }

    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            soundtrack.stop();
            Greenfoot.setWorld(new TittleScreen());
        }
    }

}
