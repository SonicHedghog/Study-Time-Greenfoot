import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends Super_Actor
{
    private GreenfootImage PacOpen;
    private GreenfootImage PacClosed;
    public static boolean hasPowerBerry = false ;
    int x = 0;
    boolean goOut = false;
    int Power_Pellet_Wait = Greenfoot.getRandomNumber(15)*100;
    public static int Pellets_Eaten = 0;
    public static int Ghost_Ate = 0;
    public static int all ;
    public static int ghost ;
    
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Vocabulary.setHelp(getWorld());
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
            if(getImage()==PacOpen && Greenfoot.getRandomNumber(20)<10)
        {
            setImage(PacClosed);
        }
            else
        {
            setImage(PacOpen);
        }
            move(2);
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
            if(getImage()==PacOpen && Greenfoot.getRandomNumber(20)<10)
        {
            setImage(PacClosed);
        }
            else
        {
            setImage(PacOpen);
        }
            move(-2);
        }
        try
        {
            eatPellet();
        }
        catch(IOException e)
        {
            
        }
        eatGhost();
        if(goOut == false && x< Power_Pellet_Wait)
        {
            x++;
        }
        else if(goOut == false && x == Power_Pellet_Wait)
        {
        getWorld().addObject(new Power_Pellet(), 50,50);
        goOut = true;
        }
    }    
    
    public void move()
    {
        if(Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a")){
            turn(30);
        }
        if(Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d")){
            turn(-30);
        }
        if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("w")){
            if(getImage()==PacOpen)
        {
            setImage(PacClosed);
        }
        else
        {
            setImage(PacOpen);
        }
            move(30);
        }
        if(Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s")){
            if(getImage()==PacOpen)
        {
            setImage(PacClosed);
        }
        else
        {
            setImage(PacOpen);
        }
            move(-30);
        }
    }
    
    public void eatPellet() throws IOException
    {
        if(isTouching(Power_Pellet.class))
        {
            
            if(Vocabulary.run(10))
                {
                   hasPowerBerry=true; 
                }
                else
                {
                    
                }
            removeTouching(Power_Pellet.class);
        }
        if(isTouching(Pellet.class))
        {
            removeTouching(Pellet.class);
            Pellets_Eaten+=1*50;
            all++;
            if((all%5) == 0)
            {
                if(Vocabulary.run())
                {
                    
                }
                else
                {
                    Pac_Island.score-=1000;
                }
            }
            
        }
        if(all == 30 && ghost == 4)
        {
            getWorld().showText("You Win!!!",getWorld().getWidth()/2, getWorld().getHeight()/2);
            getWorld().addObject(new Back_Button(), getWorld().getWidth()-100, getWorld().getHeight()-50);
        }
    }
    
    public void eatGhost()
    {
        if(hasPowerBerry == true)
        {
            
            if(isTouching(Inky.class))
            {
                removeTouching(Inky.class);
                Ghost_Ate+=1*50;
                ghost++;
            }
            if(isTouching(Clyde.class))
            {
                removeTouching(Clyde.class);
                Ghost_Ate+=1*50;
                ghost++;
            }
            if(isTouching(Pinky.class))
            {
                removeTouching(Pinky.class);
                Ghost_Ate+=1*50;
                ghost++;
            }
            if(isTouching(Blinky.class))
            {
                removeTouching(Blinky.class);
                Ghost_Ate+=1*50;
                ghost++;
            }
        }
        else
        {
             if(isTouching(Blinky.class) && hasPowerBerry == false)
             {
                 setImage(PacOpen);
                 Greenfoot.playSound("PacmanDies.mp3");
                 for(int x = 0; x<10; x++)
                 {
                     Greenfoot.delay(15);
                     turn(36);
                 }
                     Greenfoot.setWorld(new Title());
             }
             if(isTouching(Clyde.class) && hasPowerBerry == false)
             {
                 setImage(PacOpen);
                 Greenfoot.playSound("PacmanDies.mp3");
                 for(int x = 0; x<10; x++)
                 {
                     Greenfoot.delay(15);
                     turn(36);
                 }
                     Greenfoot.setWorld(new Title());
             }
             if(isTouching(Inky.class) && hasPowerBerry == false)
             {
                 setImage(PacOpen);
                 Greenfoot.playSound("PacmanDies.mp3");
                 for(int x = 0; x<10; x++)
                 {
                     Greenfoot.delay(15);
                     turn(36);
                 }
                     Greenfoot.setWorld(new Title());
             }
             if(isTouching(Pinky.class) && hasPowerBerry == false)
             {
                 setImage(PacOpen);
                 Greenfoot.playSound("PacmanDies.mp3");
                 for(int x = 0; x<10; x++)
                 {
                     Greenfoot.delay(15);
                     turn(36);
                 }
                     Greenfoot.setWorld(new Title());
             }
        }
    }
    
    public boolean getShared()
    {
        return hasPowerBerry;
    }

    public PacMan()
    {
        PacClosed = new GreenfootImage("PacClosed.png");
        PacOpen = new GreenfootImage("PacOpen.png");
        hasPowerBerry = false;
        all = 0;
        ghost = 0;
    }
}
