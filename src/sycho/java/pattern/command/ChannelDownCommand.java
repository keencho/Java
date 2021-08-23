package sycho.java.pattern.command;

public class ChannelDownCommand implements Command{
    private RemoteControl remoteControl;

    public ChannelDownCommand(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        int currentChannelIndex = remoteControl.getChannelList().indexOf(remoteControl.getChannel());

        if (currentChannelIndex == 0) {
            remoteControl.setChannel(remoteControl.getChannelList().get(remoteControl.getChannelList().size() - 1));
        } else {
            remoteControl.setChannel(remoteControl.getChannelList().get(currentChannelIndex - 1));
        }

        System.out.println("현재 채널은 " + remoteControl.getChannel() + "번 입니다.");

    }
}
