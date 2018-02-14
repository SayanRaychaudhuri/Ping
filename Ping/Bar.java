import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bar extends Actor
{

    private GreenfootImage image1;
    private String upKey;
    private String downKey;
    private int barDirection = -90;
    
    
    public Bar(String upKey1, String downKey1)
    {
        image1 = new GreenfootImage("pongbar.png"); 
        upKey = upKey1;
        downKey = downKey1;
        setImage(image1);
        setBarDirection();
    }

    public void act()
    {
        checkKeypress();       
    }
    
    public void checkKeypress()
    {
        if ( Greenfoot.isKeyDown(upKey) )
        {
            move(30);
        }
        if ( Greenfoot.isKeyDown(downKey) )
        {
            move(-30);
        }
    }
    
    private void setBarDirection()
    {
        turn(barDirection);
    }
    
    public int getBarDirection()
    {
    return barDirection;
    }
    
    public void setBarDirection(int barDirection)
    {
        this.barDirection = barDirection;
        turn(barDirection);
    }

}