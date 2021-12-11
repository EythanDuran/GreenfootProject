import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monster extends Actor
{
    private int damage=1;
    private int xScreenlimit;
    private int yScreenlimit;
    private int speedx=-2;
    private int speedy=2;
    private int monsterValue=20;
    private Player player;

    private RecordManager recordManager;
    private Record record;

    public Monster(World screen){
        xScreenlimit=screen.getWidth()-1;
        yScreenlimit=screen.getHeight()-1;

    }

    public void act() 
    { 
        monsterMovement();
        monsterDefeated();
    }  

    public void monsterMovement(){
        int x=getX();
        int y=getY();

        if(x<10){
            speedx=Greenfoot.getRandomNumber(5)+2;  
            getImage().mirrorHorizontally();
        }

        if(x>xScreenlimit){
            speedx=(Greenfoot.getRandomNumber(5)+2)*-1; 
        }

        if(y<10){
            speedy=(Greenfoot.getRandomNumber(5)+2); 
        }

        if(y>yScreenlimit){
            speedy=(Greenfoot.getRandomNumber(5)+2)*-1; 
        }

        setLocation(x+speedx,y+speedy);

        if(isAtEdge()){
            player.damagePlayer(damage);
        }
    }

    public void monsterDefeated(){
        if(Greenfoot.mouseClicked(this)){

            Level world=(Level)getWorld();
            Scoreboard scoreboard=world.getScoreboard();
            scoreboard.updateScoreboard(this.monsterValue);

            getWorld().removeObject(this);
        }
    }

    public void obtainPlayer(Player playerInGame){
        this.player=playerInGame;
    }
}

