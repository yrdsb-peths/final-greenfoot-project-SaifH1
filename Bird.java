import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    GreenfootImage[] fly = new GreenfootImage[8];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Bird()
    {
        for(int i = 0; i < fly.length; i++)
        {
            fly[i] = new GreenfootImage("images/elephant_idle/idle"+ i + ".png");
            fly[i].scale(100, 100);
        }
        animationTimer.mark();
        setImage(fly[0]);
    }
    
    int imageIndex = 0;
    public void animateBird()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        setImage(fly[imageIndex]);
        imageIndex = (imageIndex + 1)  % fly.length;
    }
    
    int speed = 1;
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+speed, getY());
        animateBird();
    }
}

