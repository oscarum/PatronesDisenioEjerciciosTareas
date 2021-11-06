package patronesDisenio.estructural.bridge;

public class Radio implements Device
{
    private boolean enabledState;
    private int volume;
    private int channel;

    public Radio()
    {
        System.out.println("Creating radio");
        enabledState = false;
        volume = 0;
        channel = 0;
    }

    @Override
    public boolean isEnabled()
    {
        System.out.println("Is radio enabled?");
        return enabledState;
    }

    @Override
    public void enable()
    {
        System.out.println("Enabling radio");
        enabledState = true;
    }

    @Override
    public void disable()
    {
        System.out.println("Disabling radio");
        enabledState = false;
    }

    @Override
    public int getVolume()
    {
        System.out.println("Getting radio volume");
        return volume;
    }

    @Override
    public void setVolume(int percent)
    {
        System.out.println("Setting radio volume");
        volume = percent;
    }

    @Override
    public int getChannel()
    {
        System.out.println("Getting radio channel");
        return channel;
    }

    @Override
    public void setChannel(int channel)
    {
        System.out.println("Setting radio channel");
        this.channel = channel;
    }
}
