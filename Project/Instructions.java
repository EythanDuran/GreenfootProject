import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Instructions extends Button
{
    GreenfootSound soundtrack;

    public Instructions(GreenfootSound soundtrack) 
    {
        GreenfootImage instructionButton=new GreenfootImage(280,60);
        Font changeFont=new Font(true,false,40);
        instructionButton.setFont(changeFont);
        instructionButton.setColor(Color.WHITE);
        instructionButton.drawString("Instructions",0,50);
        setImage(instructionButton);
        
        this.soundtrack=soundtrack;
    }    

    public void clicked(){
        Greenfoot.setWorld(new InstructionsMenu(soundtrack));
    }  

}
