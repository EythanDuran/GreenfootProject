import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.util.List;

public class Level extends World
{
    private Scoreboard scoreboard;
    private Player player;
    private FearBar fearBar;

    private int monstersQuantity=4;
    private int countLevel=1;
    
    private Record record;
    private RecordManager recordManager;
    
    GreenfootSound soundtrack;

    public Level(RecordManager recordManager,Record record,GreenfootSound soundtrack)
    {    
        super(600, 400, 1,false);
        fearBar=new FearBar(100,20,player);
        player=new Player(record,recordManager,soundtrack,fearBar);
        fearBar.setPlayer(player);
        
        scoreboard=new Scoreboard(0,record);
        this.recordManager=recordManager;
        this.record=record;
        this.soundtrack=soundtrack;
        
        prepare();
    }

    public Level(Player secondLevelPlayer,Scoreboard secondLevelScoreboard, FearBar secondLevelFearBar,
    int monsterAmount, int counter,RecordManager recordManager,Record record,GreenfootSound soundtrack)
    {
        super(600, 400, 1,false);
        this.player= secondLevelPlayer;
        this.fearBar=secondLevelFearBar;
        this.scoreboard=secondLevelScoreboard;
        this.monstersQuantity=monsterAmount+=3;
        this.countLevel=counter+=1;
        this.recordManager=recordManager;
        this.record=record;
        this.soundtrack=soundtrack;
        
        showText("NewLevel! "+countLevel, 300, 390);
        prepare();
    }

    public void act(){
        if(getObjects(Monster.class).size()==0){
            Greenfoot.setWorld(new Level(player,scoreboard,fearBar,monstersQuantity,countLevel,recordManager,record,soundtrack));
        }
    }

    void prepare(){
        GreenfootImage image =new GreenfootImage("Level1.png");
        Background imageBackground= new Background(image);
        addObject(imageBackground,getWidth()/2,200);

        addObject(fearBar,60,390);
        addObject(scoreboard,getWidth()/2,scoreboard.getImage().getHeight()/2);
        fearBar.updateFearbar();
        randomMonsterGeneration();

    }

    public Scoreboard getScoreboard(){
        return scoreboard;   
    }

    public void randomMonsterGeneration(){
        for(int i=0;i<monstersQuantity;i++){
            int x=Greenfoot.getRandomNumber(getWidth()-1);
            int y=Greenfoot.getRandomNumber(getHeight()-1);

            Monster monster=new Monster(this);
            monster.obtainPlayer(player);
            addObject(monster,x,y);
        }

    } 
}
