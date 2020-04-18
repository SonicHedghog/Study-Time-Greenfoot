import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back_Button extends Button
{
    World world;
    
    /**
     * Act - do whatever the Back_Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.mousePressed(this))
       {
            world = Vocabulary.back.get(Vocabulary.back.size() - 1);
            Vocabulary.back.remove(Vocabulary.back.size()-1);
            Greenfoot.setWorld(world);
       }
    }
    public Back_Button()
    {
        GreenfootImage back = new GreenfootImage("1305956073799096411red-back-arrow-md-hi.png");
        back.scale(100,63);
        setImage(back);
    }
}
