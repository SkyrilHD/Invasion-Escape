import greenfoot.*;

public class CountdownCorner extends Actor
{
    private int startingTime;
    private int seconds = 180;
    
    private long lastCurrentSecond;
    
    private boolean count = false;
    
    public CountdownCorner() {
        this.startingTime = 5;
        seconds = startingTime;
        this.startClock();
    }
    public void act() 
    {
        if (getWorld().getObjects(Spieler.class).size() != 0){
            if (System.currentTimeMillis() - lastCurrentSecond >= 1000) {
                lastCurrentSecond += 1000;
                seconds--;
            }
            if (seconds == 0) {
                if (MyWorld.class.isInstance(getWorld())) ((MyWorld)getWorld()).musik.stop();
                if (MyWorld2.class.isInstance(getWorld())) ((MyWorld2)getWorld()).musik.stop();
                if (MyWorld3.class.isInstance(getWorld())) ((MyWorld3)getWorld()).musik.stop();
                Greenfoot.playSound("GameOverSound.mp3");
                getWorld().addObject(new GameOver(), 300, 200);
                getWorld().addObject(new Retry(), 300, 280);
                getWorld().removeObjects(getWorld().getObjects(Spieler.class));
            }
        }
    }
    public void startClock() {
        lastCurrentSecond = System.currentTimeMillis();
        count = true;
    }
    public void stopClock() {
        count = false;
        seconds = startingTime;
    }
}
