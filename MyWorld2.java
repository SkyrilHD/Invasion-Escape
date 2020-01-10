import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    
    public GreenfootSound musik = new GreenfootSound("Never Gonna Give You Up (8 Bit Remix Cover Version) [Tribute to Rick Astley] - 8 Bit Universe-NAp.mp3");
    
    public MyWorld2()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("background.png");
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space")){
            
            addObject(new Spieler(), 300, 360);
            addObject(new Gegner(), 50, 50);
            addObject(new Countdown(10), 0, 0);
        }
    }
    public void MusikStart()
    {
        musik.play(); 
    }
    
    public void MusikStop()
    {
        musik.stop();
    }
}
