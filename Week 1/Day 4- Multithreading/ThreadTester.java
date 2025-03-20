public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Thread t1 = new Thread1();
        t1.start();

        System.out.println("Main thread stopped");
    }
}
