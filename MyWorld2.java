import greenfoot.*;

public class MyWorld2 extends World
{
    public GreenfootSound musik = new GreenfootSound("Never Gonna Give You Up [8 Bit].mp3");
    
    public MyWorld2()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Level2.png");
        addObject(new Spieler(), 300, 370);
        addObject(new Gegner(), 200, 40);
        addObject(new Gegner(), 400, 40);
        addObject(new Countdown(10), 0, 0);
    }
}
