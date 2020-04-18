import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inky extends Ghost
{
    private GreenfootImage blueGhost1;
    private GreenfootImage blueGhost2;
    int x = 0;
    
    public Inky(){
        blueGhost1 = new GreenfootImage ("blueGhost1.png");
        blueGhost2 = new GreenfootImage ("blueGhost2.png");
    }
    /**
     * Act - do whatever the Inky wants to do. This method is called whenever
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
        if(getImage()==blueGhost1)
            {
                setImage(blueGhost2);
            }
            else
            {
            setImage(blueGhost1);
            }
            move(2);
        }
    }
}
