package sycho.java.pattern.strategy;

public class TossPay implements PayStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("토스 페이로 결제 - 금액 : " + amount);
    }
}
