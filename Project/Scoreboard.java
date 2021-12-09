import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private String label;
    private int fontSize;
    private Color textColor;
    private Color backgroundColor;
    private int score;
    
    public Scoreboard(int score){
       this.score=score;
       this.label=""+score;
       fontSize=24;
       textColor=Color.WHITE;
       backgroundColor=new Color(0,0,0,0);
       updateScoreboardImage();
    }
    
    public void setText(String text){
     this.label=text;
     updateScoreboardImage();
    }
    
    public void updateScoreboard(int previousScore){
        score+=previousScore;
        setText(""+score);
    }
    
    public void updateScoreboardImage(){
        GreenfootImage scoreImage=new GreenfootImage(label,fontSize,textColor,backgroundColor);
        setImage(scoreImage);
    }  
}
