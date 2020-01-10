import greenfoot.*;

public class Gegner extends Actor
{
    public void act() 
    {
        move(2);
        spawn();
        if(this.isAtEdge()){
            getWorld().addObject(new Gegner(), 0, 50);
            getWorld().removeObject(this);
        }
    }
    public void spawn(){
        if(getWorld() == null) return;
        if (Greenfoot.getRandomNumber(100) < 3) {
            getWorld().addObject(new Kugel(), this.getX(), this.getY());
        }
    }
}