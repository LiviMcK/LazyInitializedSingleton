public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {  // Create at least 3 threads and start them
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
