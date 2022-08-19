package sycho.java.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 인증 유틸
 *
 * 인증 코드를 생성하는 클래스이며 테이블 없이 토큰값만으로 토큰과 유효기간을 검증한다.
 */
public class Verification {
    private static byte[] salt = "26KslUu37jxw7pkQCK.ctav8".getBytes();

    public static final long JWT_TOKEN_VERIFICATION_SEC = 60 * 3; // 3분

    public static class Core {
        private Type verificationType;
        private String verifiedBy;
        private String encoded;
        private String verificationCode;
        private LocalDateTime expireDateTime;
        private long expireSec;

        public Core() {
        }

        public void setEncoded(String encoded) {
            this.encoded = encoded;
        }

        public String getEncoded() {
            return encoded;
        }

        public LocalDateTime getExpireDateTime() {
            return expireDateTime;
        }

        public Core(LocalDateTime expireDateTime) {
            this.expireDateTime = expireDateTime;
        }

        public Core(Type verificationType, String verifiedBy) {
            this.verificationType = verificationType;
            this.verifiedBy = verifiedBy;
            this.verificationCode = String.format("%06d", (int)(Math.random() * 1000000));
            this.expireDateTime = LocalDateTime.now().plusSeconds(JWT_TOKEN_VERIFICATION_SEC);
            this.expireSec = JWT_TOKEN_VERIFICATION_SEC;
        }

        public String getStrings() {
            return String.format("%s@%s@%s@%s",
                    this.verificationType.name(),
                    this.verifiedBy,
                    this.verificationCode,
                    this.expireDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            );
        }

        // 클라이언트에 내리기전 필수
        public void clearCode() {
            this.verificationCode = null;
        }
    }

    public enum Type {
        PHONE_NUMBER, EMAIL
    }

    public static class Result {
        boolean success;
        Type type;

        public boolean isSuccess() {
            return success;
        }

        public Type getType() {
            return type;
        }

        public Result() {
        }

        public Result(boolean success, Type type) {
            this.success = success;
            this.type = type;
        }

        public static Result success() {
            return new Result(true, null);
        }

        public static Result fail(Type type) {
            return new Result(false, type);
        }

        public enum Type {
            NOT_MATCH, EXPIRED
        }
    }

    /////////////////////////////////////////////////////////////
    ////////////////////////////////// Utils
    /////////////////////////////////////////////////////////////
    public static Verification.Core generateVerificationCore(Verification.Type verificationType, String verifiedBy) {
        var verificationDto = new Verification.Core(verificationType, verifiedBy);
        verificationDto.setEncoded(encodeSHA512(verificationDto.getStrings()));

        return verificationDto;
    }

    public static Verification.Result verification(Verification.Core verificationDto) {
        var encoded = verificationDto.getEncoded();

        if (LocalDateTime.now().isAfter(verificationDto.getExpireDateTime())) {
            return Verification.Result.fail(Result.Type.EXPIRED);
        }

        if (!encoded.equals(encodeSHA512(verificationDto.getStrings()))) {
            return Verification.Result.fail(Result.Type.NOT_MATCH);
        }

        return Verification.Result.success();
    }

    private static String encodeSHA512(String data) {
        try {
            var md = MessageDigest.getInstance("SHA-256");
            md.update(salt);
            md.update(data.getBytes());
            return String.format("%064x", new BigInteger(1, md.digest()));
        } catch (Exception ignore) {
            return null;
        }
    }

}
