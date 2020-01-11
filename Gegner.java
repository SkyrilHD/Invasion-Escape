import greenfoot.*;

public class Gegner extends Actor
{
    public Gegner()
    {
        getImage().scale(getImage().getWidth() - 170, getImage().getHeight() - 170);
        setImage(getImage());
    }
    public void act() 
    {
        move(2);
        if (MyWorld.class.isInstance(getWorld()))
        spawnE();
        if (MyWorld2.class.isInstance(getWorld()) || MyWorld3.class.isInstance(getWorld()))
        spawnMH();
        if(this.isAtEdge()){
            getWorld().addObject(new Gegner(), 0, this.getY());
            getWorld().removeObject(this);
        }
    }
    public void spawnE(){
        if(getWorld() == null) return;
        if (Greenfoot.getRandomNumber(100) < 3) {
            getWorld().addObject(new Kugel(0), this.getX()+25, this.getY()+35);
        }
    }
    public void spawnMH(){
        if(getWorld() == null) return;
        if (Greenfoot.getRandomNumber(100) < 5) {
            getWorld().addObject(new Kugel(0), this.getX()+25, this.getY()+35);
        }
    }
}