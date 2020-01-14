import greenfoot.*;

public class Countdown extends Actor
{
    private int startingTime;
    private int seconds = 180;
    
    private long lastCurrentSecond;
    
    private boolean timeUp = false;
    private boolean count = false;
    
    public Countdown() {
    }
    public Countdown(int startingTime) {
        this.startingTime = startingTime;
        seconds = startingTime;
        this.startClock();
    }
    public void act() 
    {
        if (count && !timeUp && (getWorld().getObjects(Spieler.class).size() != 0)) {
        if (System.currentTimeMillis() - lastCurrentSecond >= 1000) {
            lastCurrentSecond += 1000;
            seconds--;
            drawTime();
        }
        if (seconds == 0 && MyWorld.class.isInstance(getWorld())) {
            timeUp = true;
            ((MyWorld)getWorld()).musik.stop();
            Greenfoot.setWorld(new Pause1());
        }
        if (seconds == 0 && MyWorld2.class.isInstance(getWorld())) {
            timeUp = true;
            ((MyWorld2)getWorld()).musik.stop();
            Greenfoot.setWorld(new Pause2());
        }
        if (seconds == 0 && MyWorld3.class.isInstance(getWorld())) {
            timeUp = true;
            getWorld().showText("Du bist entkommen!", 300, 200);
            ((MyWorld3)getWorld()).musik.stop();
            Greenfoot.playSound("VictorySound.mp3");
            Greenfoot.stop();
        }
       }
    } 
    private void drawTime() {
        int min = (int) (seconds / 60);
        int sec = seconds % 60;
        String remainingTime;
        if (sec < 10) {
            remainingTime = min + ":0" + sec;
        }
        else {
            remainingTime = min + ":" + sec;
        }
        getWorld().showText("Verbleibende Zeit: " + remainingTime, 470, 385);
    }
    public boolean timeUp() {
        return timeUp;
    }
    public void startClock() {
        lastCurrentSecond = System.currentTimeMillis();
        count = true;
    }
}
