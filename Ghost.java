import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ghost extends Super_Actor
{
    public GreenfootImage Scared1 = new GreenfootImage("scaredGhost1.png");
    public GreenfootImage Scared2 = new GreenfootImage("scaredGhost2.png");
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public static void move()
    {
        
    }
    
    public boolean doScram(boolean a)
    {
        if(a==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Ghost()
    {
        GreenfootImage Scared1 = new GreenfootImage("scaredGhost1.png");
        GreenfootImage Scared2 = new GreenfootImage("scaredGhost2.png");
    }
}
