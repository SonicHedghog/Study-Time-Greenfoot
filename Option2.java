import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Option2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option2 extends World
{

    /**
     * Constructor for objects of class Option2.
     * 
     */
    public Option2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
        addObject(new W3(),(int)((double)(getWidth())/2.3),110);
        GreenfootImage[] pics = new GreenfootImage[]{new GreenfootImage("Algernon in Space.PNG"),new GreenfootImage("flash-cards.jpg"),new GreenfootImage("PacMan Island.PNG"), new GreenfootImage("Pizza_Title.PNG")};
        World[] games = new World[]{new Space_Title(), new Flashcard(), new Title(), new Cat_Title()};
        for(int c = 0; c < games.length; c++)
        {
            pics[c].scale(getWidth()/3 ,(int)((double)(getHeight())*(5.0/16.0)));
        }
        int x = (int)((float)(getWidth()) * (133.0/600.0));
        int y = (int)((float)(getHeight()) * (150.0/400.0));
        int z = 1;
        for(int game = 0; game < games.length; game++)
        {
            addObject(new Spare_Image(pics[game],games[game]), x, y);
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
        GreenfootImage set = new GreenfootImage("Red-Space-Watercolor-Backgrounds.jpg");
        set.scale(800,600);
        setBackground(set);
        //addObject(new Arrow(), (int)((float)(getWidth()) * (7.0/8.0)), (int)((float)(getHeight()) * (9.0/16.0)));
    }
    
}
