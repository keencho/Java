package sycho.java.pattern.builder;

public class BuilderClient {
    public static void main(String[] args) {
        Person person = new Person
                .Builder("keencho", "20")
                .gender("man")
                .job("developer")
                .build();

        System.out.println(person.toString());

    }
}
