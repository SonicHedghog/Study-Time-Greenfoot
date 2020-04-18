import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space_Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Space_Title()
    {    
        super(800, 600, 1);  
        Greenfoot.setWorld(new Title_Page());
        GreenfootImage background=getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        createStars(50);
        addObject(new AISG(), getWidth()/2,getHeight()/2);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
    }
    private void createStars(int number){
        for(int z=0;z<number;z++){
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(),x,y);
        }
    }
}
