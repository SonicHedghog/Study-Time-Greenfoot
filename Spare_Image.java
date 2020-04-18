import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spare_Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spare_Image extends Button
{
    World place;
    String sub;
    int curr = 0;
    /**
     * Act - do whatever the Spare_Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Spare_Image(GreenfootImage pic, World game) 
    {
        setImage(pic);
        place =game;
    }    
    public Spare_Image(GreenfootImage pic, String subject, int current)
    {
        setImage(pic);
        place = new Option1();
        sub = subject;
        curr = current;
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            Vocabulary.setBack(getWorld());
            Greenfoot.setWorld(place);
            if(curr == 1)
            {
                Vocabulary.setSubject(sub + "/");
            }
        }
    }
}
