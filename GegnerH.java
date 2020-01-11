import greenfoot.*;

public class GegnerH extends Actor
{
    public GegnerH()
    {
        getImage().scale(getImage().getWidth() - 170, getImage().getHeight() - 170);
        setImage(getImage());
    }
    public void act() 
    {
        setLocation(getX()-2, getY());
        spawnH();
        if(this.isAtEdge()){
            getWorld().addObject(new GegnerH(), 600, this.getY());
            getWorld().removeObject(this);
        }
    }
    public void spawnH(){
        if(getWorld() == null) return;
        if (Greenfoot.getRandomNumber(100) < 5) {
            getWorld().addObject(new Kugel(1), this.getX()-30, this.getY()+35);
        }
    }
}
