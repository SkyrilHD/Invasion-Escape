import greenfoot.*;

public class Spieler extends Actor
{
    public void act() 
    {
        if (MyWorld.class.isInstance(getWorld())) ((MyWorld)getWorld()).musik.play();
        if (MyWorld2.class.isInstance(getWorld())) ((MyWorld2)getWorld()).musik.play();
        if (MyWorld3.class.isInstance(getWorld())) ((MyWorld3)getWorld()).musik.play();
        if (Greenfoot.isKeyDown("A")){
            setLocation(this.getX()-4, this.getY());
            setImage("Car_L.png");
        }
        if (Greenfoot.isKeyDown("D")){
            setLocation(this.getX()+4, this.getY());
            setImage("Car_R.png");
        }
        if (this.getOneIntersectingObject(Kugel.class) != null){
            if (MyWorld.class.isInstance(getWorld())) ((MyWorld)getWorld()).musik.stop();
            if (MyWorld2.class.isInstance(getWorld())) ((MyWorld2)getWorld()).musik.stop();
            if (MyWorld3.class.isInstance(getWorld())) ((MyWorld3)getWorld()).musik.stop();
            Greenfoot.playSound("GameOverSound.mp3");
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(new Kugel(0));
            getWorld().removeObject(new Kugel(1));
            getWorld().addObject(new Explosion(), this.getX(), this.getY());
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
