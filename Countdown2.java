import greenfoot.*;

public class Countdown2 extends Actor
{
    private int startingTime;
    private int seconds = 180;
    
    private long lastCurrentSecond;
    private long timeSaved = 0;
    
    private boolean timeUp = false;
    private boolean count = false;
    private boolean countDown = true;
    
    private String text;
    
    public Countdown2(int startingTime) {
        this.startingTime = startingTime;
        seconds = startingTime;
        this.startClock();
    }
    
    public void act() 
    {
        if (System.currentTimeMillis() - lastCurrentSecond >= 1000) {
            lastCurrentSecond += 1000;
            seconds--;
            drawTime();
        }
        if (seconds == 0) {
            timeUp = true;
            ((MyWorld2)getWorld()).musik.stop();
            Greenfoot.setWorld(new MyWorld3());
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
        getWorld().showText("Verbleibende Zeit: " + remainingTime, 480, 385);
    }
    
    public boolean timeUp() {
        return timeUp;
    }
    
    public void startClock() {
        lastCurrentSecond = System.currentTimeMillis() - timeSaved;
        count = true;
    }
    
    public void stopClock() {
        timeSaved = System.currentTimeMillis() - lastCurrentSecond;
        count = false;
    }
    
    public void resetClock() {
        seconds = startingTime;
        timeUp = false;
    }
}
