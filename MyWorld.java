import greenfoot.*;

public class MyWorld extends World
{
    public GreenfootSound musik = new GreenfootSound("Bad [8 Bit].mp3");
    
    public MyWorld()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Level1.png");
        addObject(new Spieler(), 300, 360);
        addObject(new Gegner(), 50, 50);
        addObject(new Countdown(10), 0, 0);
    }
}