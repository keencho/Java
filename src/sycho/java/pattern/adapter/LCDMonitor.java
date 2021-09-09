package sycho.java.pattern.adapter;

public class LCDMonitor implements Monitor{

    @Override
    public void on() {
        System.out.println("LCD Monitor ON");
    }

    @Override
    public void off() {
        System.out.println("LCD Monitor OFF");
    }
}
