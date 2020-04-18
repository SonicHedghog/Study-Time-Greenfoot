import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Button extends Button
{
    /**
     * Act - do whatever the Play_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x = 0;
    static int card;
    int curr = 1;
    public void act() 
    {
        
        if(x == 0)
        {
            if(Greenfoot.mousePressed(this))
        {
            Vocabulary.setBack(getWorld());
            Greenfoot.setWorld(new Option1());
            if(curr == 1)
            {
                Vocabulary.setSubject("English" + "/");
            }
        }
        }
        else
        {
            if(Greenfoot.mousePressed(this))
            {    
                card++;
                Flashcard.count = 0;
                getWorld().removeObjects(getWorld().getObjects(Spare_Image.class));
            }
        }
    }    
    public Play_Button(int one)
    {
        GreenfootImage play = new GreenfootImage("green-plain-play-button-icon-hi.png");
        play.scale(50,50);
        setImage(play);
        x = one;
        card = 0;
    }
    public Play_Button()
    {
        
    }
}
