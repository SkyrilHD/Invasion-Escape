import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends Actor
{
    int cooldown = 0;
    
    public Bullet() 
    {
        getImage().scale(getImage().getWidth() - 400, getImage().getHeight() - 760);
        setImage(getImage());
    }
    public void act() 
    {
        if(cooldown > 0) {
            cooldown -= 1;
        }
        if (this.isTouching(Gegner.class) && (cooldown == 0)) {
            cooldown = 100000;
            getWorld().removeObjects(getWorld().getObjects(Gegner.class));
            getWorld().addObject(new Gegner(), 0, 50);
        }
        setLocation(this.getX(), this.getY()-1);
        
        if (this.isAtEdge()) getWorld().removeObject(this);
    }   
}
