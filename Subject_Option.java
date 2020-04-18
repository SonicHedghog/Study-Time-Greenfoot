import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Subject_Option extends World
{

    /**
     * Constructor for objects of class Subject.
     * 
     */
    public Subject_Option()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage set = new GreenfootImage("Red-Space-Watercolor-Backgrounds.jpg");
        set.scale(800,600);
        setBackground(set);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
        addObject(new Subject(),(int)((double)(getWidth())/2.5),125);
        GreenfootImage [] pics = {new GreenfootImage("AP Human Geo",50, Color.WHITE, new Color(0, 0, 0, 0)), new GreenfootImage("Biology",50, Color.WHITE, new Color(0, 0, 0, 0)), new GreenfootImage("English",50, Color.WHITE, new Color(0, 0, 0, 0)), new GreenfootImage("Latin",50, Color.WHITE, new Color(0, 0, 0, 0))};
        String [] subs = {"AP Human Geo","Biology","English","Latin"};
        int x = (int)((float)(getWidth()) * (133.0/600.0));
        int y = (int)((float)(getHeight()) * (1.0/2.0));
        int z = 1;
        for(int game = 0; game < pics.length; game++)
        {
            addObject(new Spare_Image(pics[game], subs[game], 1), x, y);
            if(z == 2)
            {
                x = (int)((float)(getWidth()) * (133.0/600.0));
                y = (int)((float)(getHeight()) * (300.0/400.0));
                z = 1;
            }
            else
            {
                x+=(int)((float)((getWidth()) * (225.0/600.0)));
                z=2;
            }
        }
    }
}
