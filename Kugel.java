import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Kugel extends Actor
{
    int xSpeed, ySpeed, maxY, initX, initY;
    int time = 0;
    
    public Kugel(int i){
        if (i == 0)
        {    
            xSpeed = (int) (5 * Math.cos(15 * Math.PI / 180));
            ySpeed = (int) (5 * Math.sin(15 * Math.PI / 180));
            maxY = ySpeed * (ySpeed +1) / 2;
        }
        if (i == 1)
        {    
            xSpeed = (int) (-5 * Math.cos(15 * Math.PI / 180));
            ySpeed = (int) (-5 * Math.sin(15 * Math.PI / 180));
            maxY = ySpeed * (ySpeed +1) / 2;
        }
    }
    public void addedToWorld(World w)
    {
        initX = getX();
        initY = getY();
    }
    public void act() 
    {
        time++;
        int newX = initX + xSpeed * time;
        int timeDif = (int) Math.abs(time - ySpeed);
        int distDif = maxY - timeDif * (timeDif + 1) / 2;
        int newY = initY - distDif;
        setLocation(newX, newY);
        if (this.isAtEdge()) getWorld().removeObject(this);
    }    
}
