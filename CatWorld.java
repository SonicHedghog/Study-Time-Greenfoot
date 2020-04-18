import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CatWorld  extends World
{
    static GreenfootSound play;
    
    /**
     * Constructor for objects of class FallWorld.
     * 
     */
    public CatWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(800, 600, 1);
        //add a cat on position
        Vocabulary.setHelp(this);
        addObject( new Cat(), 45, 450);
        addObject(new MeanAnimal(), 500, 0);
        for(int x = 0; x < 7; x++)
        {
             addObject( new Pizza(), Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(200));
        }
        play = new GreenfootSound("VeggieTales- Pizza Angel - Silly Song .mp3");
        play.playLoop();
    }
    
   /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    {
        // 2 % of the time add a pizza at a random location
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            addObject( new Pizza(), Greenfoot.getRandomNumber(getHeight()),0);
        }
    }
    public static void stop()
    {
        play.stop();
    }
}
