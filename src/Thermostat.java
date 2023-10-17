package src;

public class Thermostat implements Device {
    private int temperature;

    @Override
    public String turnOn() {
        this.temperature = 35;
        return "Thermostat turned on";
    }

    @Override
    public String turnOff() {
        temperature = 0;
        return "Thermostat turned off";
    }

    @Override
    public String increase() {
        return "Thermostat temperature increased. Temperature is now " + ++this.temperature + "°C";
    }

    @Override
    public String decrease() {
        return "Thermostat temperature decreased. Temperature is now " + --this.temperature + "°C";
    }

    @Override
    public String getStatus() {
        if (temperature > 0) {
            return "Thermostat is on with a temperature of " + temperature + "°C";
        } else {
            return "Thermostat is off";
        }
    }

    @Override
    public String getType() {
        return "Thermostat";
    }

}
