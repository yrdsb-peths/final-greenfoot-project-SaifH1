import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DuckRight extends Actor
{
    GreenfootImage[] flyRight = new GreenfootImage[3];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    
    public DuckRight()
    {
        int duckColour = Greenfoot.getRandomNumber(3);
        for(int i = 0; i < flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/ducks/duck"+ duckColour + i + ".png");
            flyRight[i].scale(60, 60);
        }
        
        animationTimer.mark();
    }
    
    int speed = 1;
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    int duckColour;
    public void setColour(int clr)
    {
        duckColour = clr;
    }
    
    int imageIndex = 0;
    public void animateDuckFlying()
    {
        if(animationTimer.millisElapsed() < 175)
        {
            return;
        }
        animationTimer.mark();
        setImage(flyRight[imageIndex]);
        imageIndex = (imageIndex + 1)  % flyRight.length;
    }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateDuckFlying();
        
        setLocation(getX() + speed, getY());
        
        MyWorld world = (MyWorld) getWorld();
        if(isAtEdge())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}