import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DuckLeft extends Actor
{
    GreenfootImage[] flyLeft = new GreenfootImage[3];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public DuckLeft()
    {
        int duckColour = Greenfoot.getRandomNumber(3);
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/ducks/duck"+ duckColour + i + ".png");
            flyLeft[i].mirrorHorizontally();
            flyLeft[i].scale(60, 60);
        }
        
        animationTimer.mark();
    }
    
    int speed = 1;
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    
    int imageIndex = 0;
    public void animateDuckFlying()
    {
        if(animationTimer.millisElapsed() < 175)
        {
            return;
        }
        animationTimer.mark();
        setImage(flyLeft[imageIndex]);
        imageIndex = (imageIndex + 1)  % flyLeft.length;
        }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateDuckFlying();
        {
            setLocation(getX()-speed, getY());
        }
    }
}
