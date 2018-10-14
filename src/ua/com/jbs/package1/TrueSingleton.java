package ua.com.jbs.package1;

public class TrueSingleton {

    private static final TrueSingleton INSTANCE = new TrueSingleton();

    public static TrueSingleton getInstance() {
        return INSTANCE;
    }

}
