import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    private int canShoot;
    private int duration=350;
    
    boolean isPoweredUp=false;
    boolean isFiredUp=false;
    boolean isInjected=false;
    
    boolean powerFire=false;
    boolean solid=true;
    Actor Algernon;
    
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Vocabulary.help = getWorld();
        checkKeys();
        canShoot--;
        try
        {    Ding();
        }
        catch(IOException e)
        {
            
        }
        Quint();
        Deca();
        Infite();
        Countdown();
        if(solid==true)
        {
                if(getOneIntersectingObject(Algernon.class)!=null)
            {
                getWorld().addObject(new Explosion(),getX(),getY());
                Greenfoot.playSound("explodingSound.wav");
                for(int x =0; x <100000;x++)
                {
                    Algernon=getOneIntersectingObject(Algernon.class);
                }
                getWorld().removeObject(Algernon);
                getWorld().removeObject(this);

                Greenfoot.setWorld(new Dead());
                Greenfoot.delay(10);
            }
        }
    }    
    
    private void moveUp(){
        setLocation(getX(),getY()-5);
    }
    private void moveUpFast(){
        setLocation(getX(),getY()-10);
    }
    
    private void moveDown(){
        setLocation(getX(),getY()+5);
    }
    private void moveDownFast(){
        setLocation(getX(),getY()+10);
    }
    
    private void checkKeys(){
        if(Greenfoot.isKeyDown("up")){
            moveUp();
        }
        if(Greenfoot.isKeyDown("down")){
            moveDown();
        }
        if(Greenfoot.isKeyDown("space") && (canShoot <=0)){
            fire();
            Greenfoot.playSound("bam.wav");
            canShoot=25;
        }
    }
    public void fire()
    {
        if(powerFire==false)
        {
            getWorld().addObject(new Flowers(),getX(),getY());
        }
        else if(powerFire==true)
        {
            getWorld().addObject(new PoweredUp(),getX(),getY());
        }
    }
    
    private void Ding() throws IOException
    {
        if(isTouching(WumboPowerup.class))
        {
            if(Vocabulary.run())
            {
                isFiredUp=true;
            }
            Actor WumboPowerup=getOneIntersectingObject(WumboPowerup.class);
            getWorld().removeObject(WumboPowerup);
        }
        if(isTouching(MumboPowerup.class))
        {
            if(Vocabulary.run())
            isPoweredUp=true;
            Actor MumboPowerup=getOneIntersectingObject(MumboPowerup.class);
            getWorld().removeObject(MumboPowerup);
        }
        if(isTouching(MindSyrum.class))
        {
            if(Vocabulary.run())
            isInjected=true;
            Actor MindSyrum=getOneIntersectingObject(MindSyrum.class);
            getWorld().removeObject(MindSyrum);
        }
    }
    private void Countdown()
    {
        if(isPoweredUp || isFiredUp || isInjected)
        {
            getWorld().addObject(new Timer(),1000,1);
        }
    }
    
    private void Quint()
    {
        if(isPoweredUp==true && duration>0)
        {
            if(Greenfoot.isKeyDown("space") && (canShoot <=0))
            {
                fire();
                Greenfoot.playSound("bam.wav");
                canShoot=10;
            }
            duration--;
            if(duration==1)
            {
                duration=310;
                isPoweredUp=false;
            }
        }
    }
    private void Deca()
    {
        if(isFiredUp==true && duration>1)
        {
            powerFire=true;
            if(Greenfoot.isKeyDown("up")){
                moveUpFast();
            }
            if(Greenfoot.isKeyDown("down")){
                moveDownFast();
            }
            duration--;
            if(duration==1)
            {
               duration=320;
               powerFire=false;
               isFiredUp=false;
            }
        }
    }
    private void Infite()
    {
        if(isInjected==true && duration>1)
        {
            solid=false;
            duration--;
            if(duration==1)
            {
               duration=330;
               solid=true;
               isInjected=false;
            }
        }
    }
}
