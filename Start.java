import greenfoot.*;

public class Start extends Actor
{
    public Start()
    {
        getImage().scale(getImage().getWidth() - 150, getImage().getHeight() - 70);
        setImage(getImage());
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new MyWorld());
        }
    }    
}
