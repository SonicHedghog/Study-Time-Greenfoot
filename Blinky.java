import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blinky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blinky extends Ghost
{
    private GreenfootImage redGhost1;
    private GreenfootImage redGhost2;
    int x =0;
    public Blinky(){
        redGhost1 = new GreenfootImage ("redGhost1.png");
        redGhost2 = new GreenfootImage ("redGhost2.png");
    }
    /**
     * Act - do whatever the Blinky wants to do. This method is called whenever
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
               turn(-90);
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
            if(getImage()==redGhost1)
            {
                setImage(redGhost2);
            }
            else
            {
                setImage(redGhost1);
            }
            move(2);
        }
    }
}
