import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Algernon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Algernon extends Actor
{
    private int Special;
    private int Unique;
    private int Genass;
    
    /**
     * Act - do whatever the Algernon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()-7,getY());
        if(getX()<=0){
            setLocation(1000,Greenfoot.getRandomNumber(600));
        }
        if(getOneIntersectingObject(Flowers.class)!=null)
        {
            getWorld().addObject(new Explosion(),getX(),getY());
            Greenfoot.playSound("explodingSound.wav");
            Actor Flowers=getOneIntersectingObject(Flowers.class);
            getWorld().removeObject(Flowers);
            Space.Score++;
            respawn();
        }
    }    
    private void respawn(){
        setLocation(getWorld().getWidth()+20,Greenfoot.getRandomNumber(600));
        
    }
}
