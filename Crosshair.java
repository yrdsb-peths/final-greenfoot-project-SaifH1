import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crosshair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crosshair extends Actor
{
    
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
    }
    
    public void hit()
    {
        if(isTouching(DuckLeft.class) && Greenfoot.isKeyDown("space"))
        {
            removeTouching(DuckLeft.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnDuck();
            world.increaseScore();
        }
        if(isTouching(DuckRight.class) && Greenfoot.isKeyDown("space"))
        {
            removeTouching(DuckRight.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnDuck();
            world.increaseScore();
        }
    }
}
