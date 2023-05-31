import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Shotgun shotgun = new Shotgun();
        addObject(shotgun, 400, 300);
        
        Bird bird = new Bird();
        addObject (bird, 0, 100);
        
        Crosshair crosshair = new Crosshair();
        addObject(crosshair, 300, 200);
    }
}
