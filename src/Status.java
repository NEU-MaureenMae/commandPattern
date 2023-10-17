package src;

public class Status implements Command {
    private Device device;

    public Status(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        return device.getStatus();
    }
}
