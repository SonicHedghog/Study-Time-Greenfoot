import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flowers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flowers extends Actor
{
    boolean isBwaa=false;
    /**
     * Act - do whatever the Flowers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+5,getY());
        if(getX()>=getWorld().getWidth()-1){
            getWorld().removeObject(this);
        }
    }    
}
