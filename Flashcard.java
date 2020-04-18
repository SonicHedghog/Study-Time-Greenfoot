import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flashcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flashcard extends World
{
    static int count = 0;
    /**
     * Constructor for objects of class Flashcard.
     * 
     */
    public Flashcard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Play_Button(2), 60, 507);
        addObject(new Back_Button(), getWidth()-100, getHeight()-50);
        Play_Button.card = 0;
    }
    
    public int getCount()
    {
        return count;
    }   
    
    public static void resetCount()
    {
        count = 0;
    }
    
    public void act()
    {   
        Vocabulary.setHelp(this);
        if(! (Play_Button.card < Vocabulary.problems.size()))
        {
            Play_Button.card = 0;
        }
        if(Greenfoot.mousePressed(this))
        {
            if(count == 0)
            {
                count++;
                removeObjects(getObjects(Spare_Image.class));
            }
            else
            {
                count--;
                removeObjects(getObjects(Spare_Image.class));
            }
        }
        if(count == 0)
        {
            for(int y = 0; y < Vocabulary.time; y++)
            {
                showText("",getWidth()/2,20+(y*25));
            }
            Vocabulary.print(Vocabulary.problems.get(Play_Button.card));
            
        }
        else
        {
            for(int y = 0; y < Vocabulary.time; y++)
            {
                showText("",getWidth()/2,20+(y*25));
            }
            Vocabulary.print(Vocabulary.answers.get(Vocabulary.problems.get(Play_Button.card)));
        }
    }
}
