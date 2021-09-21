package sycho.java.pattern.builder;

public class TelescopingConstructor {
    private String name;
    private String age;
    private String gender;
    private String job;
    private String birthday;
    private String address;

    public TelescopingConstructor(String name, String age) {
        this(name, age, "unknown");
    }

    public TelescopingConstructor(String name, String age, String gender) {
        this(name, age, gender, "unknown");
    }

    public TelescopingConstructor(String name, String age, String gender, String job) {
        this(name, age, gender, job, "unknown");
    }

    public TelescopingConstructor(String name, String age, String gender, String job, String birthday) {
        this(name, age, gender, job, birthday, "unknown");
    }

    public TelescopingConstructor(String name, String age, String gender, String job, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.birthday = birthday;
        this.address = address;
    }
}
