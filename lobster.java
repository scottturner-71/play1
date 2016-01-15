import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Actor
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        forward(150);//100 steps forward;
        turnRight(90);
        forward(50);//50 steps forward;
        turnRight(90);
        forward(150);//100 steps forward;
        turnRight(90);
        forward(50);//100 steps forward;
        turnRight(90);
        //backward(15);//100 steps forward;
        //turnLeft(90);
        //backward(5);//50 steps forward;
       //turnLeft(90);
        //backward(15);//100 steps forward;
        //turnLeft(90);
       // backward(5);//100 steps forward;
        //turnLeft(90);
       
        stop();
    } 

    private void turnRight(int degrees)
    {
        turn(degrees);
        Greenfoot.delay(1);
    }
    private void turnLeft(int degrees)
    {
        turn(-1*degrees);
        Greenfoot.delay(1);
    }
    private void forward(int step)
    {
        move(step);
        Greenfoot.delay(1);
    }
    private void backward(int step)
    {
        turn(180);
        move(step);
        Greenfoot.delay(1);
    }
    private void stop()
    {
       Greenfoot.stop();
    }
    
}
