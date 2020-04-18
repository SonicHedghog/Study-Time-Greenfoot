import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MumboPowerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MumboPowerup extends Actor
{
    /**
     * Act - do whatever the MumboPowerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5,getY());
        if(getX()<=5)
        {
            getWorld().removeObject(this);
        }
        
    }    
}
