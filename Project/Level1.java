import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private Scoreboard scoreboard;
    private Player player;
    private FearBar fearBar;
    
    public Level1()
    {    
       super(600, 400, 1,false);
       player=new Player();
       fearBar=new FearBar(100,20,player);
       scoreboard=new Scoreboard(0);
       TittleScreen.startMusic();
       
       prepare();
    }
    
    public Level1(Player secondLevelPlayer,Scoreboard secondLevelScoreboard, FearBar secondLevelFearBar)
    {
     super(600, 400, 1,false);
     this.player= secondLevelPlayer;
     this.fearBar=secondLevelFearBar;
     this.scoreboard=secondLevelScoreboard;
     
     prepare();
    }
    
    void prepare(){
     GreenfootImage image =new GreenfootImage("Level1.png");
     Background imageBackground= new Background(image);
     addObject(imageBackground,getWidth()/2,200);
        
     addObject(fearBar,60,390);
     addObject(scoreboard,getWidth()/2,scoreboard.getImage().getHeight()/2);
     randomMonsterGeneration();
    }
    
    
    public Scoreboard getScoreboard(){
     return scoreboard;   
    }
    
    public void randomMonsterGeneration(){
       for(int i=0;i<7;i++){
        int x=Greenfoot.getRandomNumber(getWidth()-1);
        int y=Greenfoot.getRandomNumber(getHeight()-1);
         
         Monster monster=new Monster(this);
         monster.obtainPlayer(player);
         addObject(monster,x,y);
       }
    }
    
    public void act(){
      if(getObjects(Monster.class).size()==0){
       Greenfoot.setWorld(new Level1(player,scoreboard,fearBar));   
      }
    }
    
}
