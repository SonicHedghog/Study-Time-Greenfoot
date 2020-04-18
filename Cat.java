import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

/**
 * Write a description of class Catcher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat  extends Actor
{
    //class fields 
    private GreenfootImage cat_sit;
    private GreenfootImage cat_left;
    private GreenfootImage cat_left2;
    private GreenfootImage cat_right;
    private GreenfootImage cat_right2;
    private GreenfootImage cat_eat;
    private GreenfootImage cat_eat2;
    private GreenfootImage fly;
    private GreenfootImage fly2;
    private GreenfootImage fall;
    private GreenfootImage fall2;
    private GreenfootImage dancing;
    private GreenfootImage dancing2;
    private GreenfootImage dancing3;
    private GreenfootImage dancing4;
    int numberOfPizzaEat = 0;
     
     /**
     * Act - do whatever the Catcher wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move();
    try
    {
       canSee(Pizza.class);
       eat(Pizza.class);
    }
    catch(IOException e)
    {
        
    }
    }    
      
    

     /**
     * Try to delete an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing. Returns false if nothing was deleted, returns true if something
     * was deleted
     */
    public void eat(Class clss) throws IOException
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            numberOfPizzaEat++;
            getWorld().removeObject(actor);  //remove pizza from world
            setImage(cat_eat);
            wait(8);
            setImage(cat_eat2);
            if(numberOfPizzaEat == 5)
            {
                CatWorld.play.pause();
                if(Vocabulary.run())
                {
                    wait(3);
                    for(int x = 0; x<3;x++)
                    {
                        wait(8);
                        if(getImage() == dancing)
                        {
                            setImage(dancing2);
                        }
                        else
                        {
                            setImage(dancing);
                        }
                    }
                    for(int x = 0; x<6;x++)
                    {
                        wait(8);
                        if(getImage() == dancing4)
                        {
                            setImage(dancing3);
                        }
                        else
                        {
                            setImage(dancing4);
                        }
                    }
                    
                }
                wait(6);
                setImage(cat_sit);
                numberOfPizzaEat = 0;
                CatWorld.play.play();
        }
        
        }
    }
    
    
 
    
    /**
     * check if pizza is near the cat in a radius.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }
    
     public void wait(int time)
    {
        Greenfoot.delay(time);
    }
    
    public void move()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            if(getImage() == cat_right)
            {
                setImage(cat_right2);
            }
            else
            {
                setImage(cat_right);
            }
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            if(getImage() == cat_left)
            {
                setImage(cat_left2);
            }
            else
            {
                setImage(cat_left);
            }
        }
        jump();
    }
    
    public void jump()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            if(getImage() == fly)
            {
                setImage(fly2);
            }
            else
            {
                setImage(fly);
            }
            setLocation(getX(),getY()-5);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            if(getImage() == fall)
            {
                setImage(fall2);
            }
            else
            {
                setImage(fall);
            }
            setLocation(getX(),getY()+8);
        }
    }
    
    public Cat()
    {
        cat_sit = new GreenfootImage("cat-sit.png");
        cat_left = new GreenfootImage("cat-walk-left.png");
        cat_left2 = new GreenfootImage("cat-walk-left2.png");
        cat_right = new GreenfootImage("cat-walk-right.png");
        cat_right2 = new GreenfootImage("cat-walk-right2.png");
        cat_eat = new GreenfootImage("cat-eat.png");
        cat_eat2 = new GreenfootImage("cat-eat2.png");
        fly = new GreenfootImage("small-cat-fly.png");
        fly2 = new GreenfootImage("small-cat-fly-2.png");
        fall = new GreenfootImage("small-cat-fall.png");
        fall2 = new GreenfootImage("small-cat-fall-2.png");
        dancing = new GreenfootImage("cat-dance.png");
        dancing2 = new GreenfootImage ("cat-dance-2.png");
        dancing3 = new GreenfootImage("small-cat-dance.png");
        dancing4 = new GreenfootImage("small-cat-dance.png");
    }
    public Cat(int a)
    {
        
    }

    
}
