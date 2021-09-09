package sycho.java.pattern.adapter;

public class AdaptorClient {
    public static void main(String[] args) {
        LCDMonitor lcdMonitor = new LCDMonitor();
        LEDMonitor ledMonitor = new LEDMonitor();

        System.out.println("===========================");

        lcdMonitor.on();
        lcdMonitor.off();

        System.out.println("===========================");

        ledMonitor.on();
        ledMonitor.off();

        System.out.println("===========================");

        TV monitorTV = new MonitorAdapter(ledMonitor);
        monitorTV.on();
        monitorTV.off();
        monitorTV.volumeUp();
        monitorTV.volumeDown();

        System.out.println("===========================");
    }
}
