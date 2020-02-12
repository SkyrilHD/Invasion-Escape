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
        if (this.getX() <= 90) {
            getWorld().addObject(new CountdownCorner(), 0, 0);
        }
        if (this.getX() >= 90) {
            if (getWorld().getObjects(CountdownCorner.class).size() != 0) {
                getWorld().getObjects(CountdownCorner.class).get(0).stopClock();
                getWorld().removeObjects(getWorld().getObjects(CountdownCorner.class));
            }
        }
        if (this.getOneIntersectingObject(Kugel.class) != null){
            getWorld().removeObject(new Kugel(0));
            getWorld().removeObject(new Kugel(1));
            getWorld().addObject(new Explosion(), this.getX(), this.getY());
            GE();
        }
    }
    public void GE()
    {
        if (MyWorld.class.isInstance(getWorld())) ((MyWorld)getWorld()).musik.stop();
        if (MyWorld2.class.isInstance(getWorld())) ((MyWorld2)getWorld()).musik.stop();
        if (MyWorld3.class.isInstance(getWorld())) ((MyWorld3)getWorld()).musik.stop();
        Greenfoot.playSound("GameOverSound.mp3");
        getWorld().addObject(new GameOver(), 300, 200);
        getWorld().addObject(new Retry(), 300, 280);
        getWorld().removeObject(this);
    }
}
