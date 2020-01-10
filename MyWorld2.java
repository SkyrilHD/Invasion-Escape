import greenfoot.*;

public class MyWorld2 extends World
{
    public GreenfootSound musik = new GreenfootSound("Never Gonna Give You Up (8 Bit Remix Cover Version) [Tribute to Rick Astley] - 8 Bit Universe-NAp.mp3");
    
    public MyWorld2()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Background2.png");
        addObject(new Spieler(), 300, 370);
        addObject(new Gegner(), 50, 40);
        addObject(new Countdown2(10), 0, 0);
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
