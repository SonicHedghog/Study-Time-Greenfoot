import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option1 extends World
{

    /**
     * Constructor for objects of class Option1.
     * 
     */
    public Option1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
        addObject(new W2(),(int)((double)(getWidth())/2.3),110);
        addObject(new Default(), 150, getHeight()-50);
        GreenfootImage set = new GreenfootImage("Red-Space-Watercolor-Backgrounds.jpg");
        set.scale(800,600);
        setBackground(set);
    }
}
