package abstraccion;
import java.util.Date;

public class Pescado implements Comida{

	private double nutrition;
    private String colour;
    private Date expiration;

    public Pescado(double nutrition, String colour, Date expiration)
    {
        this.nutrition = nutrition;
        this.colour = colour;
        this.expiration = expiration;
    }

    public double getNutrition()
    {
        return nutrition;
    }

    public void setNutrition(double nutrition)
    {
        this.nutrition = nutrition;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }
}
