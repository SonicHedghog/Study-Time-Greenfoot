import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pac_Island extends World
{

    public static int Pellets_Eaten;
    public static int PowerPelletWait = Greenfoot.getRandomNumber(20);
    static int score;
    int x=0;
    GreenfootSound round = new GreenfootSound("WakaWaka.mp3");
    static boolean now;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Pac_Island()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Greenfoot.setWorld(new Title());
        addObject(new PacMan(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(550));
        addObject(new Blinky(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(550));
        addObject(new Pinky(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(550));
        addObject(new Clyde(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(550));
        addObject(new Inky(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(550));
        
        for(int i=0;i<30;i++){
            addObject(new Pellet(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(350));
        }
        score = 0;
        GreenfootImage set = new GreenfootImage("Pacman_Island.png");
        set.scale(800,600);
        setBackground(set);
        now = true;
    }

    public void act()
    {
        if(PacMan.ghost != 4 || PacMan.all != 30)
        {
            if(now)
            {
               Greenfoot.delay(100);
               now = false;
            }
            score = score + 1 + PacMan.Pellets_Eaten + PacMan.Ghost_Ate;        
            showText("Score: " + score,500,50);
            PacMan.Ghost_Ate = 0;
            PacMan.Pellets_Eaten = 0;
            if(!(round.isPlaying()))
            {
                round.play();
            }
        }
    }
}
