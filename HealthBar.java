import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    GreenfootImage[] healthImages = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    boolean isShooting = false;
    
    public HealthBar()
    {
        // Load the animation images
        for(int i = 0; i < healthImages.length; i++)
        {
            healthImages[i] = new GreenfootImage("images/healthbar/healthbar"+ i + ".png");
            healthImages[i].scale(50, 50);
        }
        setImage(healthImages[0]);
        animationTimer.mark();
    }
    
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
