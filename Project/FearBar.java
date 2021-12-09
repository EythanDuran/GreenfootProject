import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FearBar extends Actor
{
    private int width;
    private int height;
    private Player player;
    
    public FearBar(int width, int height, Player player){
     this.width=width;
     this.height=height;
     this.player=player;
    }
    
    public int getWidth(){
     return width;   
    }
    
    public int getHeight(){
     return height;   
    }
    
    public void act() 
    {
        drawBar();
    }    
    
    public void drawBar(){
        GreenfootImage barImage=new GreenfootImage(width,height);
        barImage.setColor(Color.GRAY);
        int fearPercentage=(int)(player.getFearStatus()*width);
        barImage.fillRect(0,0,fearPercentage,height);
        setImage(barImage);
    }
}
