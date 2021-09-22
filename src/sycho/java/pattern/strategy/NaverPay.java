package sycho.java.pattern.strategy;

public class NaverPay implements PayStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("네이버 페이로 결제 - 금액 : " + amount);
    }
}
