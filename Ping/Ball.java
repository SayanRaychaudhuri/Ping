import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Ball extends Actor
{
    private GreenfootImage image1;
    private int velocityX = 10;
    private int velocityY = 0;
    private int opponent1Point = 0;
    private int opponent2Point = 0;
    private static int direction = 5;
    public Ball()
    {
        image1 = new GreenfootImage("pongball.png");
        setImage(image1);
    }

    public void act()
    {
      move(direction);
      newPosition();
      reset();
      PingWorld w = (PingWorld)getWorld();
      w.showText(Integer.toString(opponent1Point), 450, 50);
      w.showText(Integer.toString(opponent2Point), 550, 50);
    }
    
    public void reset()
    {
        PingWorld w = (PingWorld)getWorld();
        if(getX()>=950) {
           w.startingPositions();
           opponent1Point++;
        } 
        
        if(getX()<=50) {
           w.startingPositions();
           opponent2Point++;
        }

    }
    
    public void newPosition(){
        int currentX = getX();
        int currentY = getY();
        velocityY = currentY<=580 ? velocityY+10 : velocityY-Greenfoot.getRandomNumber(101) ;
        direction *= isTouching(Bar.class) ? -1 : 1;
        //velocityX *= isTouching(Bar.class) ? -1 : 1;
        int deltaX = 0; 
        //deltaX += velocityX;
        int deltaY = 0;
        deltaY += velocityY;
        setLocation(currentX+deltaX, currentY+deltaY); 
    }
    
}
