public class MyRunnable implements Runnable {
    @Override
    public void run() {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        int hashCode = singleton.getHashCode();
        System.out.println("Singleton Hash Code: " + hashCode);
    }
}
