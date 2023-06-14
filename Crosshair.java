import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crosshair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crosshair extends Actor
{
    GreenfootImage[] crosshairImages = new GreenfootImage[2];
    SimpleTimer animationTimer = new SimpleTimer();
    boolean hitmarker = false;
    
    public Crosshair()
    {
        // Load the animation images
        
        
        for(int i = 0; i < crosshairImages.length; i++)
        {
            crosshairImages[i] = new GreenfootImage("images/hitmarker/hitmarker" + i + ".png");
            crosshairImages[i].scale(50, 50);
        }
        setImage(crosshairImages[0]);
        animationTimer.mark();
    }
    
    public void hit()
    {
        if(isTouching(DuckLeft.class) && Greenfoot.isKeyDown("space"))
        {
            removeTouching(DuckLeft.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnDuck();
            world.increaseScore();
            hitmarker = true;
        }
        if(isTouching(DuckRight.class) && Greenfoot.isKeyDown("space"))
        {
            removeTouching(DuckRight.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnDuck();
            world.increaseScore();
            hitmarker = true;
        }
    }
    
    int imageIndex = 0;
    public void animateHitmarker()
    {
        // Delay the shot
        if(animationTimer.millisElapsed() < 175) 
        {
            return;
        }
        animationTimer.mark();
        imageIndex = (imageIndex + 1);
        if (imageIndex >= 2)
        {
            hitmarker = false;
            imageIndex = 0;
            setImage(crosshairImages[0]);
        }
        setImage(crosshairImages[imageIndex]);
    }
    
    /**
     * Act - do whatever the Crosshair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int movementSpeed = 4;
        // Add your action code here.
        if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up"))
        {
            setLocation(getX()-movementSpeed, getY()-movementSpeed);
        }
        else if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up"))
        {
             setLocation(getX()+movementSpeed, getY()-movementSpeed);
        }
        else if(Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("down"))
        {
             setLocation(getX()-movementSpeed, getY()+movementSpeed);
        }
        else if(Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("down"))
        {
             setLocation(getX()+movementSpeed, getY()+movementSpeed);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
             setLocation(getX()+movementSpeed, getY());
        }
        else if(Greenfoot.isKeyDown("left"))
        {
             setLocation(getX()-movementSpeed, getY());
        }
        else if(Greenfoot.isKeyDown("down"))
        {
             setLocation(getX(), getY()+movementSpeed);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(), getY()-movementSpeed);
        }
        
        hit();
        if(hitmarker == true)
        {
            animateHitmarker();
        }
    }
}
