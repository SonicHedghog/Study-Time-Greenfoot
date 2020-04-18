import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Pawn
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public Help()
    {
        GreenfootImage hell = new GreenfootImage(600,350);
        hell.drawString("Actually... it means a simple descriptive piece in verse or prose, often describing rural life",50,150);
        
        setImage(hell);
    }
}
