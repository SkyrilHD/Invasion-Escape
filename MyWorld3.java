import greenfoot.*;

public class MyWorld3 extends World
{
    public GreenfootSound musik = new GreenfootSound("Lucky You [8 Bit].mp3");
    
    public MyWorld3()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Level3.png");
        addObject(new Spieler(), 300, 360);
        addObject(new Gegner(), 50, 40);
        addObject(new GegnerH(), 550, 40);
        addObject(new Countdown(246), 0, 0);
    }
}
