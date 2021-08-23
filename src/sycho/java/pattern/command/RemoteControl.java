package sycho.java.pattern.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControl {
    private List<Integer> channelList = new ArrayList<>(Arrays.asList(1, 2, 7, 9, 11, 16, 20, 23, 27, 30));
    private int channel = 1;
    private int volume = 5;

    public List<Integer> getChannelList() {
        return channelList;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
