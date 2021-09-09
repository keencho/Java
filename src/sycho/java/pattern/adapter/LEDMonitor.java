package sycho.java.pattern.adapter;

public class LEDMonitor implements Monitor{

    @Override
    public void on() {
        System.out.println("LED Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("LED Monitor OFF");
    }
}
