import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AISG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AISG extends Actor
{
    /**
     * Act - do whatever the AISG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Space());
            Greenfoot.delay(20);
        }
        else if(Greenfoot.isKeyDown("z"))
        {
            Greenfoot.setWorld(new Dead());
        }
    }    
}
