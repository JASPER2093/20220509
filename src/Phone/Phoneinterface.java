package Phone;

public interface Phoneinterface {
    public static final int TIMEOUT = 10000;

    public abstract void sendcall();

    public abstract void recivecall();

    public default void printlogo() {
        System.out.println("***Phone***");
    }

}
