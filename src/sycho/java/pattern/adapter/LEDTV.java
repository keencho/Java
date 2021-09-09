package sycho.java.pattern.adapter;

public class LEDTV implements TV{

    @Override
    public void on() {
        System.out.println("LED TV ON");
    }

    @Override
    public void off() {
        System.out.println("LED TV OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("LED TV VOLUME UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("LED TV VOLUME DOWN");
    }
}
