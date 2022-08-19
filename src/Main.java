import sycho.java.utils.Verification;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var core = Verification.generateVerificationCore(Verification.Type.PHONE_NUMBER, "12345678");

        // 성공
        var s1 = Verification.verification(core);
        System.out.println(s1.isSuccess());

        Thread.sleep(Verification.JWT_TOKEN_VERIFICATION_SEC * 1000);

        // 실패
        var s2 = Verification.verification(core);
        System.out.println(s2.isSuccess());
    }
}
