package patronesDisenio.abstractFactory;


public class ModernChair implements Chair
{
    @Override
    public void sitOn(String person)
    {
        System.out.println(person + " is sitting on a modern chair");
    }
}
