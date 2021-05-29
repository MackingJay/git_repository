/*
    双重检查锁
 */

public class DoubleCheckLock {
    private static DoubleCheckLock doubleCheckLock;
    private DoubleCheckLock(){

    }

    public static DoubleCheckLock getInstance() {
        if (doubleCheckLock == null) {
            synchronized (DoubleCheckLock.class) {
                doubleCheckLock = new DoubleCheckLock();
            }
        }
            return doubleCheckLock;
    }

    public static void main(String[] args) {
        DoubleCheckLock d=DoubleCheckLock.getInstance();
        System.out.println(d);
        DoubleCheckLock c=DoubleCheckLock.getInstance();
        System.out.println(d);

    }
}
