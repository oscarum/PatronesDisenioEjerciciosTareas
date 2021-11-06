package patronesDisenio.estructural.adaptador;



public class RoundHole
{
    private double radius;

    public RoundHole(double radius)
    {
        this.radius = radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
}
