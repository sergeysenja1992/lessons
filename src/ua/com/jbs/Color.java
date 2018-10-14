package ua.com.jbs;

public enum Color {

    GREEN("#001234"), RED("#FF0000");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return name() + "->" + code;
    }

}
