import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kugel extends Actor
{
    int xSpeed, ySpeed, maxY, initX, initY;
    int time = 0;
    
    public Kugel(){
        xSpeed = (int) (5 * Math.cos(15 * Math.PI / 180));
        ySpeed = (int) (5 * Math.sin(15 * Math.PI / 180));
        maxY = ySpeed * (ySpeed +1) / 2;
    }
    
    public void addedToWorld(World w)
    {
        initX = getX();
        initY = getY();
    }
    
    public void act() 
    {
        time++; // increments time counter
        int newX = initX + xSpeed * time; // calculates the new x-coordinate value
        int timeDif = (int) Math.abs(time - ySpeed); // calculates the time difference to the apex of the trajectory
        int distDif = maxY - timeDif * (timeDif + 1) / 2; // calculates the vertical distance from its starting location
        int newY = initY - distDif; // calculates the new y-coordinate value 
        setLocation(newX, newY);
        if (this.isAtEdge()) getWorld().removeObject(this);
    }    
}
