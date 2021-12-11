import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int fear;
    private int maximumFear;
    private Scoreboard score;
    private RecordManager recordManager;
    private Record record;
    GreenfootSound soundtrack;
    FearBar fearbar;

    public Player(Record record,RecordManager recordManager,GreenfootSound soundtrack,  FearBar fearbar){
        maximumFear=30;
        fear=maximumFear;
        this.record=record;
        this.recordManager=recordManager;
        this.soundtrack=soundtrack;
        this.fearbar=fearbar;
    }

    public double getFearStatus(){
        return (double)fear/maximumFear;   
    }

    public void damagePlayer(int damage){
        fear-=damage;
        fearbar.updateFearbar();
        if(fear<=0){

            Greenfoot.setWorld(new GameOver(record,recordManager,soundtrack));
        }  
    }
}
