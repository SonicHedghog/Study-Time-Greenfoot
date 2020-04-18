import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza  extends Actor
{
        private GreenfootImage pizza1 = new GreenfootImage("pizza_cheese.png"); //set image of pizza
        
        private int speed; //set the speed of each leaf
        int x;
        int y;
        int length;
        boolean change = true;
        
    /**
     * This is a constrctor for pizza.
     */
    public Pizza()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ 
        speed = (Greenfoot.getRandomNumber(2)+1);
        
     }

    /**
     * Act - do whatever the Leaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
       falling();
       checkForMiss();
    }   
    
    public void falling()
    {
        setRotation(y);
        x = getX();
        length =  getWorld().getWidth();
        y = getY()+ speed;
        if(Greenfoot.getRandomNumber(length/2) > x)
        {
            setLocation(x-speed,y);
        }
        else if(Greenfoot.getRandomNumber(length/3) <x)
        {
            setLocation(x+speed,y);
        }
        else{
            setLocation(x,y);
        }
    }
   
    public void checkForMiss(){
        if(y >= getWorld().getHeight())
        {
            getWorld().removeObject(this);
        }
    }
      
}
