import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label titleLabel = new Label ("How To Play", 80);
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 75);
        prepare();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        Label label2 = new Label("use arrow keys to aim", 45);
        addObject(label2,getWidth()/2,150);
        Label label3 = new Label("use space to shoot", 45);
        addObject(label3,getWidth()/2,200);
        Label label = new Label("press space to start the game", 45);
        addObject(label,getWidth()/2,360);
    }
}
