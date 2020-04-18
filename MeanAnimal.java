import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MeanAnimal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeanAnimal extends Animal
{
    World c = getWorld();
    /**
     * Act - do whatever the MeanAnimal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getHim();
        
    }    
    
    public void getHim()
    {
        if(isAtEdge()){
            turn(180);
        }
        if(Greenfoot.getRandomNumber(200)<2){
           if(Greenfoot.getRandomNumber(2)==1){
               turn(45);
            }
           if(Greenfoot.getRandomNumber(2)==2){
               turn(-45);
            }
        }
        move(5);
        if(isTouching(Cat.class))
        {
            removeTouching(Cat.class);
            Greenfoot.playSound("fanfare.wav");
            getWorld().addObject(new Cat_Died(getWorld()), getWorld().getWidth()/2,getWorld().getHeight()/8);
        }
        
    }
}
