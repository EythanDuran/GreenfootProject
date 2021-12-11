import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private String label;
    private int fontSize;
    private Color textColor;
    private Color backgroundColor;
    private int score;
    private Record record;

    public Scoreboard(int score,Record record){
        this.score=score;
        this.label=""+score;
        this.record=record;
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
        record.setScore(score);
    }

    public void updateScoreboardImage(){
        GreenfootImage scoreImage=new GreenfootImage(label,fontSize,textColor,backgroundColor);
        setImage(scoreImage);
    }  
}
