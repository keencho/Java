package sycho.java.pattern.command;

public class VolumeUpCommand implements Command{
    private RemoteControl remoteControl;

    public VolumeUpCommand(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        if (remoteControl.getVolume() < 10) {
            remoteControl.setVolume(remoteControl.getVolume() + 1);
            System.out.println("현재 볼륨은 " + remoteControl.getVolume() + "입니다.");
        } else {
            System.out.println("볼륨을 더이상 높일 수 없습니다.");
        }
    }
}
