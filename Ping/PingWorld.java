import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

/* Sayan Raychaudhuri
 * Ping Version 1 
 */
public class PingWorld extends World
{
    private Ball ball;
    private Bar bar1, bar2;
   
    public PingWorld() 
    {
        super(1000, 600, 1);
        ball = new Ball();
        bar1 = new Bar("up", "down");
        bar2 = new Bar("w", "s");   
        addObject( ball, 500, 200 );
        addObject( bar1, 900, 300 );
        addObject( bar2, 100, 300 );
    }
    
    public void startingPositions(){
        ball.setLocation(500, 200 );
    }
    
}