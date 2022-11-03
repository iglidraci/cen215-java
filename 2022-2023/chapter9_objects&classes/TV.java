public class TV {
    int channel = 1;    // default channel
    int volume = 1;     // default volume
    boolean on = false;
    public TV() {}

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel > 0 && newChannel < 50)
            channel = newChannel;
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 0 && newVolume <= 100)
            volume = newVolume;
    }

    public void channelUp() {
        setChannel(channel + 1);
    }

    public void channelDown() {
        setChannel(channel - 1);
    }

    public void volumeUp() {
        setVolume(volume + 10);
    }

    public void volumeDown() {
        setVolume(volume - 10);
    }
}
