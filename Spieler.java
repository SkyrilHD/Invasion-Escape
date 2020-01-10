import greenfoot.*;

public class Spieler extends Actor
{
    public void act() 
    {
        if (MyWorld.class.isInstance(getWorld()))
        ((MyWorld)getWorld()).MusikStart();
        if (MyWorld2.class.isInstance(getWorld()))
        ((MyWorld2)getWorld()).MusikStart();
        if (MyWorld3.class.isInstance(getWorld()))
        ((MyWorld3)getWorld()).MusikStart();
        if (Greenfoot.isKeyDown("A")){
            setLocation(this.getX()-4, this.getY());
            setImage("autos_01 L.png");
        }
        if (Greenfoot.isKeyDown("D")){
            setLocation(this.getX()+4, this.getY());
            setImage("autos_01.png");
        }
        if (this.getOneIntersectingObject(Kugel.class) != null){
            if (MyWorld.class.isInstance(getWorld()))
                ((MyWorld)getWorld()).musik.stop();
            if (MyWorld2.class.isInstance(getWorld()))
                ((MyWorld2)getWorld()).musik.stop();
            if (MyWorld3.class.isInstance(getWorld()))
                ((MyWorld3)getWorld()).musik.stop();
            Greenfoot.playSound("GameOverSound.mp3");
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(new Kugel());
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
}
