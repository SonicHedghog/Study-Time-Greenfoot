import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat_Died here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat_Died extends Words
{
    /**
     * Act - do whatever the Cat_Died wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new CatWorld());
        }
    }    
    public Cat_Died(World c)
    {
        c.addObject(new Back_Button(), c.getWidth()-100, c.getHeight()-50);
        CatWorld.stop();
    }
}
