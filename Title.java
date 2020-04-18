import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Play(), (getWidth())/2,(int)((double)(getHeight())*(3.0/4.0)));
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
    }
    public void act()
    {
        addObject(new Words(), getWidth()/2,getHeight()/4);
        addObject(new Play(), (getWidth())/2,(int)((double)(getHeight())*(3.0/4.0)));
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
    }
}
