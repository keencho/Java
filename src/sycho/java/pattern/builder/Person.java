package sycho.java.pattern.builder;

public class Person {
    private String name;
    private String age;
    private String gender;
    private String job;
    private String birthday;
    private String address;

    public static class Builder {

        // 필수
        private String name;
        private String age;

        // 비필수수
        private String gender;
        private String job;
        private String birthday;
        private String address;

        public Builder(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.job = builder.gender;
        this.birthday = builder.birthday;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", job='" + job + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
