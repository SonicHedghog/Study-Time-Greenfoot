import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;

/**
 * Write a description of class Default here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Default extends Button
{
    /**
     * Act - do whatever the Default wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    InputStream put;
    BufferedReader input ;
    Class putin = Default.class;
    public void act()
    {
       if(Greenfoot.mousePressed(this))
       {
            Vocabulary.setBack(getWorld());
            Greenfoot.setWorld(new Option2());
            ArrayList<String> nums = new ArrayList<String>();
            String a = "/" + Vocabulary.getSubject() + "default.in";
          try
            {
                put = putin.getResourceAsStream("/" + Vocabulary.getSubject() + "default.in");
                input = new BufferedReader(new InputStreamReader(put));
                while((a = input.readLine()) != null)
    		
                    nums.add(a);
                Vocabulary.setMode(nums);
            
            }
            catch(IOException ea)
            {
                
            }
        }    
    }
}
