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
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        else if(Greenfoot.isKeyDown("right"))
        {
             setLocation(getX()+5, getY());
        }
        else if(Greenfoot.isKeyDown("up"))
        {
             setLocation(getX(), getY()-5);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
             setLocation(getX(), getY()+5);
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
