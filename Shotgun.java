import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shotgun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shotgun extends Actor
{
    GreenfootImage[] shoot = new GreenfootImage[6];
    
    SimpleTimer animationTimer = new SimpleTimer();
    public Shotgun()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 275, image.getHeight() - 260);
        setImage(image);
        
        animationTimer.mark();
    
    }
    
    int imageIndex = 0;
    public void animateShotgun()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        for(int i = 0; i < shoot.length; i++)
        {
            shoot[i] = new GreenfootImage("images/Shotgun/shotgun"+ i + ".png");
            shoot[i].scale(200, 200);
        }
        animationTimer.mark();
        setImage(shoot[imageIndex]);
        imageIndex = (imageIndex + 1)  % shoot.length;
    }

    public void act()
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("space"))
        {
            animateShotgun();
        }
    }

}
