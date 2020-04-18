import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Creator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creator extends World
{

    /**
     * Constructor for objects of class Creator.
     * 
     */
    public Creator()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage set = new GreenfootImage("Red-Space-Watercolor-Backgrounds.jpg");
        set.scale(800,600);
        setBackground(set);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
    }
}
