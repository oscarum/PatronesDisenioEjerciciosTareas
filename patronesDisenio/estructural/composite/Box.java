package patronesDisenio.estructural.composite;

import java.util.ArrayList;

public class Box implements Component
{
    private ArrayList<Component> children;

    public Box()
    {
        children = new ArrayList<>();
    }

    @Override
    public double getPrice()
    {
        double price = 0;

        for (Component child: children) {
            price += child.getPrice();
        }

        return price;
    }

    public void add(Component child) {
        children.add(child);
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public ArrayList<Component> getChildren() {
        return children;
    }
}
