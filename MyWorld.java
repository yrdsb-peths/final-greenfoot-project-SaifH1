import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Shotgun shotgun = new Shotgun();
        addObject(shotgun, 400, 300);
        
        
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 350);
        
        spawnDuck();
        
        Crosshair crosshair = new Crosshair();
        addObject(crosshair, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void spawnDuck()
    {
        Duck duck = new Duck();
        int x = 0;
        int y = Greenfoot.getRandomNumber(350);
        addObject (duck, x, y);
    }
}
