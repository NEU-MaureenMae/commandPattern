package src;

public class Light implements Device {
    private int brightness;

    @Override
    public String turnOn() {
        this.brightness = 20;
        return "Light turned on";
    }

    @Override
    public String turnOff() {
        brightness = 0;
        return "Light turned off";
    }

    @Override
    public String increase() {
        return "Light brightness increased. Brightness is now " + ++this.brightness;
    }

    @Override
    public String decrease() {
        return "Light brightness decreased. Brightness is now " + --this.brightness;
    }

    @Override
    public String getStatus() {
        if (brightness > 0) {
            return "Light is on with brightness of " + brightness + "%";
        } else {
            return "Light is off";
        }
    }

    @Override
    public String getType() {
        return "Light";
    }

}
