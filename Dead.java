import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dead here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dead extends World
{

    /**
     * Constructor for objects of class Dead.
     * 
     */
    public Dead()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        GreenfootImage background=getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        createStars(50);
        addObject(new Death(), getWidth()/2,getHeight()/2);
    }
    private void createStars(int number){
        for(int z=0;z<number;z++){
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(),x,y);
        }
    }
    public void act()
    {
        showText("press R to restart or Space to go to menu", getWidth()/3,getHeight()/2);
        if(Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(new Space());

        }
        else if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Space_Title());
            Greenfoot.delay(50);
        }
    }
}
