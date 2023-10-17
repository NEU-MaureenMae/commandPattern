package src;

public class MusicPlayer implements Device {
    private int volume;

    @Override
    public String turnOn() {
        this.volume = 20;
        return "Music Player turned on";
    }

    @Override
    public String turnOff() {
        volume = 0;
        return "Music Player turned off";
    }

    @Override
    public String increase() {
        return "Music Player volume increased. Volume is now " + ++this.volume;
    }

    @Override
    public String decrease() {
        return "Music Player volume decreased. Volume is now " + --this.volume;
    }

    @Override
    public String getStatus() {
        if (volume == 0) {
            return "Music Player is off";
        } else {
            return "Music Player is on with volume of " + volume;
        }
    }

    @Override
    public String getType() {
        return "Music Player";
    }
}
