import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pause2 extends World
{

    public Pause2()
    {    
        super(600, 400, 1);
        Greenfoot.setSpeed(50);
        setBackground("Background2.png");
        showText("2. Level geschafft!", 300, 200);
        showText("Drücke 'Leertaste', um fortzufahren", 300, 220);
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new MyWorld3());
        
    }
}
