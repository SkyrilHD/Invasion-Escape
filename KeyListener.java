import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyListener here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyListener extends Actor
{
    /**
     * Act - do whatever the KeyListener wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (int i=0; i==9999999; i++)
        if (Greenfoot.getKey().equals("space")){
            spawnActor();
        }
        
    }
    
    public void spawnActor()
    {
        getWorld().addObject(new Spieler(), 300, 360);
        getWorld().addObject(new Gegner(), 50, 50);
        getWorld().addObject(new Countdown(10), 0, 0);
    }   
}
