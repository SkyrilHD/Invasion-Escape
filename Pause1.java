import greenfoot.*;

public class Pause1 extends World
{
    public Pause1()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Level1.png");
        showText("1. Level geschafft!", 300, 200);
        showText("Drücke 'Leertaste', um fortzufahren", 300, 220);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new MyWorld2());
    }
}
