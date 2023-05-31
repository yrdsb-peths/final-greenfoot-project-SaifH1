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
    
        scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 350);
        
        spawnDuck();
        
        Crosshair crosshair = new Crosshair();
        addObject(crosshair, 300, 200);
        
        Shotgun shotgun = new Shotgun();
        addObject(shotgun, 400, 300);
    }
    
    int difficulty = 1;
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if (score % 5 == 0)
        {
            difficulty +=0.5;
        }
    }
    
    public void spawnDuck()
    {
        int leftOrRight = Greenfoot.getRandomNumber(100);
        if (leftOrRight % 2 == 0)
        {
            duckRight();
        }
        else
        {
            duckLeft();
        }
    }
    
    public void duckRight()
    {
        DuckRight duck = new DuckRight();
        duck.setSpeed(difficulty);
        int x = 0;
        int y = Greenfoot.getRandomNumber(350);
        addObject (duck, x, y);
    }
    
    public void duckLeft()
    {
        DuckLeft duck = new DuckLeft();
        duck.setSpeed(difficulty);
        int x = 600;
        int y = Greenfoot.getRandomNumber(350);
        addObject (duck, x, y);
    }
}
