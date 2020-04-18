import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat_Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat_Title extends World
{

    /**
     * Constructor for objects of class Cat_Title.
     * 
     */
    public Cat_Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Cat(), (getWidth())/2,(int)((double)(getHeight())*(3.0/4.0)));
        for(int x = 0; x < 7; x++)
        {
             addObject( new Pizza(), Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(200));
        }
        addObject(new Pizza_Angel(), (int)((double)(getWidth())*(2.0/3.0)),(int)((double)(getHeight())*(3.0/8.0)));
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new CatWorld());
        }
    }
}
