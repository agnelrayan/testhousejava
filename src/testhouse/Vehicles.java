package testhouse;

interface Moveable
{
    int AVG_SPEED = 40;
    void move();
}

class Vehicles implements Moveable
{
    public void move()
    {
        System.out.println("Average speed is"+AVG_SPEED );
    }
    public static void main (String[] arg)
    {
        Vehicles vc = new Vehicles();
        vc.move();
    }
}

