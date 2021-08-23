package sycho.java.pattern.command;

public class Client {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        VolumeUpCommand volumeUpCommand = new VolumeUpCommand(remoteControl);
        VolumeDownCommand volumeDownCommand = new VolumeDownCommand(remoteControl);
        ChannelUpCommand channelUpCommand = new ChannelUpCommand(remoteControl);
        ChannelDownCommand channelDownCommand = new ChannelDownCommand(remoteControl);

        volumeUpCommand.execute();
        volumeDownCommand.execute();
        channelUpCommand.execute();
        channelDownCommand.execute();
    }
}
