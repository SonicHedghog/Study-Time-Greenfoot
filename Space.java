import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public static int Score=0;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        Greenfoot.setWorld(new Title_Page());
        setPaintOrder(Ship.class,Flowers.class);
        GreenfootImage background=getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        createStars(50);
        addObject(new Ship(),50,200);
        createMice(4);
        Score = 0;
    }
    private void createStars(int number){
        for(int z=0;z<number;z++){
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(new Star(),x,y);
        }
    }
    private void createMice(int number){
        for(int z=0;z<number;z++){
            int x=Greenfoot.getRandomNumber(getWidth())+200;
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(new Algernon(),x,y);
        }
    }
    public void act()
    {
        showText("Score: " + Score, (int)((float)(getWidth()) * (11.0/12.0)), getHeight()/8);
        if(Greenfoot.getRandomNumber(500) == 123)
        {
            int x = Greenfoot.getRandomNumber(3)+1;
            if(x == 1)
            addObject(new MumboPowerup(), getWidth(),Greenfoot.getRandomNumber(getHeight())); 
            else if(x == 2)
            addObject(new WumboPowerup(), getWidth(),Greenfoot.getRandomNumber(getHeight()));
            else if(x == 3)
            addObject(new MindSyrum(), getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
    }
}
