import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()-2,getY());
        if(getX()<=5){
            setLocation(getWorld().getWidth(),Greenfoot.getRandomNumber(getWorld().getHeight()));  
        }
    }    
    public Star(){
        GreenfootImage Star=new GreenfootImage(4,4);
        Star.setColor(Color.WHITE);
        Star.fillOval(1,1,4,4);
        setImage(Star);
    }
}
