import greenfoot.*;

public class Gegner extends Actor
{
    
    public Gegner()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 170, image.getHeight() - 170);
        setImage(image);
    }
    public void act() 
    {
        move(2);
        spawn();
        if(this.isAtEdge()){
            getWorld().addObject(new Gegner(), 0, this.getY());
            getWorld().removeObject(this);
        }
    }
    public void spawn(){
        if(getWorld() == null) return;
        if (Greenfoot.getRandomNumber(100) < 3) {
            getWorld().addObject(new Kugel(), this.getX()+25, this.getY()+35);
        }
    }
}