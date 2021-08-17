package sycho.java.pattern.singleton;

public class Singleton {

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton() { }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
