import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinky extends Ghost
{
    private GreenfootImage pinkGhost1;
    private GreenfootImage pinkGhost2;
    int x = 0;
    public Pinky(){
        pinkGhost1 = new GreenfootImage ("pinkGhost1.png");
        pinkGhost2 = new GreenfootImage ("pinkGhost2.png");
    }
    /**
     * Act - do whatever the Pinky wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        roam(PacMan.hasPowerBerry);
        if(PacMan.hasPowerBerry == true)
        {
            if(x>1500)
            {
                PacMan.hasPowerBerry = false;
                x = 0;
            }
            else
            {
                x++;
            }
        }
    }    
    public void roam(boolean hasPowerBerry){
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
        if(hasPowerBerry == true)
        {
            if(getImage()==Scared1)
            {
                setImage(Scared2);
            }
            else
            {
                setImage(Scared1);
            }
            move(5);
        }
        else
        {
        if(getImage()==pinkGhost1)
            {
                setImage(pinkGhost2);
            }
            else
            {
            setImage(pinkGhost1);
            }
            move(2);
        }
    }
}
