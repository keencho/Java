package sycho.java.pattern.adapter;

public class MonitorAdapter implements TV{

    Monitor monitor;

    public MonitorAdapter(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void on() {
        monitor.on();
    }

    @Override
    public void off() {
        monitor.off();
    }

    @Override
    public void volumeUp() {
        throw new RuntimeException("지원하지 않는 기능입니다.");
    }

    @Override
    public void volumeDown() {
        throw new RuntimeException("지원하지 않는 기능입니다.");
    }
}
