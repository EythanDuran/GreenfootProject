import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FearBar extends Actor
{
    private int width;
    private int height;
    private Player player;
    GreenfootImage barImage;
    int count;

    public FearBar(int width, int height,Player player){
        this.width=width;
        this.height=height;
        this.player=player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public int getWidth(){
        return width;   
    }

    public int getHeight(){
        return height;   
    }

    public void updateFearbar(){
        this.barImage = new GreenfootImage(width,height);
        this.barImage.setColor(Color.GRAY);
        int fearPercentage=(int)(player.getFearStatus()*width);
        this.barImage.fillRect(0,0,fearPercentage,height);
        setImage(this.barImage);

        getWorld().showText(""+count, 50, 50);
        count++;
    }
}
