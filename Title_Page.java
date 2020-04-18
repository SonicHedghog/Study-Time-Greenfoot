import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Title_Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title_Page extends World
{

    /**
     * Constructor for objects of class Title_Page.
     * 
     */
    public Title_Page()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Play_Button(), getWidth()/2,getHeight()/2 + 100);
        addObject(new W1(), getWidth()/2-100,150);
        GreenfootImage creator = new GreenfootImage("Create Game.png");
        creator.scale(200,150);
        //addObject(new Spare_Image(creator, new Creator()), getWidth()-100, getHeight()-75);
        GreenfootImage set = new GreenfootImage("Red-Space-Watercolor-Backgrounds.jpg");
        set.scale(800,600);
        setBackground(set);
    }
}
