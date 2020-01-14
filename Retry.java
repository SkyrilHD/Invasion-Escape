import greenfoot.*;

public class Retry extends Actor
{
    public Retry()
    {
        getImage().scale(getImage().getWidth() - 300, getImage().getHeight() - 150);
        setImage(getImage());
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
           if (MyWorld.class.isInstance(getWorld())) Greenfoot.setWorld(new MyWorld());
           if (MyWorld2.class.isInstance(getWorld())) Greenfoot.setWorld(new Pause1());
           if (MyWorld3.class.isInstance(getWorld())) Greenfoot.setWorld(new Pause2());
        }
    }    
}
