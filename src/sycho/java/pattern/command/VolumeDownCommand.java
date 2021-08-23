package sycho.java.pattern.command;

public class VolumeDownCommand implements Command{

    private RemoteControl remoteControl;

    public VolumeDownCommand(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    @Override
    public void execute() {
        if (remoteControl.getVolume() > 0) {
            remoteControl.setVolume(remoteControl.getVolume() - 1);
            System.out.println("현재 볼륨은 " + remoteControl.getVolume() + "입니다.");
        } else {
            System.out.println("볼륨을 더이상 낮출 수 없습니다.");
        }
    }
}
