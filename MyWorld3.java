import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{
    public GreenfootSound musik = new GreenfootSound("Lucky You [8 Bit Tribute to Eminem feat. Joyner Lucas] - 8 Bit Universe-NAp.mp3");
    
    public MyWorld3()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("background.png");
        addObject(new Spieler(), 300, 360);
        addObject(new Gegner(), 50, 50);
        //addObject(new Countdown(246), 0, 0);
        addObject(new Countdown(10), 0, 0);
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
