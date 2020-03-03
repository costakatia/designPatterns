package Structural.singleton;

public enum MyInstance {
    INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }




}
