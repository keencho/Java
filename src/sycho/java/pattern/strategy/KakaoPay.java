package sycho.java.pattern.strategy;

public class KakaoPay implements PayStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("카카오 페이로 결제 - 금액 : " + amount);
    }
}
