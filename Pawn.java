import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pawn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pawn extends Actor
{
    /**
     * Act - do whatever the Pawn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private World current;
    public boolean run(int r)
    {
        return true;
    }
    public World run() 
    {
        
        return current;
    }    
    public Pawn()
    {
        current = getWorld();
    }
}
