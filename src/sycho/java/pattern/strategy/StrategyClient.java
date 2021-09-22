package sycho.java.pattern.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        PayEnvironment pc = new PC();
        PayEnvironment mobile = new Mobile();

        pc.setPayStrategy(new KakaoPay());
        mobile.setPayStrategy(new NaverPay());

        pc.pay(10);
        mobile.pay(30);

        if (condition()) {
            mobile.setPayStrategy(new TossPay());
        }

        mobile.pay(50);
    }

    public static boolean condition() {
        // 조건
        return true;
    }
}
