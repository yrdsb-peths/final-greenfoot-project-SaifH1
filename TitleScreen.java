import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Scren
 * 
 * @author SAIF 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Duck Hunting", 80);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("i"))
        {
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
       
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(titleLabel, getWidth()/2, 75);
        Label label = new Label("press space to start the game", 45);
        addObject(label,getWidth()/2,140);
        Label label2 = new Label("press I to see how to play", 45);
        addObject(label2,getWidth()/2,190);
        
        
    }
    
}
