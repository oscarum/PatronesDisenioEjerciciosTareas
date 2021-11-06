package patronesDisenio.estructural.bridge;

public class Television implements Device
{
    private boolean enabledState;
    private int volume;
    private int channel;

    public Television()
    {
        System.out.println("Creating tv");
        enabledState = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public boolean isEnabled()
    {
        System.out.println("Is tv enabled?");
        return enabledState;
    }

    @Override
    public void enable()
    {
        System.out.println("Enabling tv");
        enabledState = true;
    }

    @Override
    public void disable()
    {
        System.out.println("Disabling tv");
        enabledState = false;
    }

    @Override
    public int getVolume()
    {
        System.out.println("Getting tv volume");
        return volume;
    }

    @Override
    public void setVolume(int percent)
    {
        System.out.println("Setting tv volume");
        volume = percent;
    }

    @Override
    public int getChannel()
    {
        System.out.println("Getting tv channel");
        return channel;
    }

    @Override
    public void setChannel(int channel)
    {
        System.out.println("Setting tv channel");
        this.channel = channel;
    }
}
