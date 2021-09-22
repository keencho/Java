package sycho.java.pattern.strategy;

public class PayEnvironment {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(int amount) {
        if (payStrategy != null) {
            payStrategy.pay(amount);
        }
    }
}
