import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shotgun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shotgun extends Actor
{
    GreenfootImage[] gunImages = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    boolean isShooting = false;
    
    public Shotgun()
    {
        // Load the animation images
        for(int i = 0; i < gunImages.length; i++)
        {
            gunImages[i] = new GreenfootImage("images/Shotgun/shotgun"+ i + ".png");
            gunImages[i].scale(200, 200);
        }
        setImage(gunImages[0]);
        animationTimer.mark();
    }
    
    int imageIndex = 0;
    public void animateShotgun()
    {
        // Delay the shot
        if(animationTimer.millisElapsed() < 100) {
            return;
        }
        animationTimer.mark();
        setImage(gunImages[imageIndex]);
        imageIndex = (imageIndex + 1)  % gunImages.length;
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            isShooting = true;
        }
        
        if(isShooting){
            animateShotgun();
        }
    }

}
