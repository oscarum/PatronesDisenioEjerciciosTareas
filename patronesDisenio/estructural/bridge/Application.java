package patronesDisenio.estructural.bridge;

public class Application
{
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl(television);
        System.out.println("Toggling power to turn tv on");
        remoteControl.togglePower();
        System.out.println("Going up 3 channels:");
        remoteControl.channelUp();
        remoteControl.channelUp();
        remoteControl.channelUp();
        System.out.println("Turning volume up by 4 levels:");
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        System.out.println("Is tv enabled? " + television.isEnabled());
        System.out.println("In channel: " + television.getChannel());
        System.out.println("Volume: " + television.getVolume());

        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);
        System.out.println("Toggling power to turn radio on");
        advancedRemoteControl.togglePower();
        System.out.println("Going up 3 channels:");
        advancedRemoteControl.channelUp();
        advancedRemoteControl.channelUp();
        advancedRemoteControl.channelUp();
        System.out.println("Turning volume up by 4 levels:");
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        advancedRemoteControl.volumeUp();
        System.out.println("Volume: " + radio.getVolume());
        System.out.println("Silence:");
        advancedRemoteControl.mute();
        System.out.println("Is radio enabled? " + radio.isEnabled());
        System.out.println("In channel: " + radio.getChannel());
        System.out.println("Volume: " + radio.getVolume());
    }
}
