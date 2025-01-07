package Thread;

public class Main {
    public static  void main(String[] args){
        System.out.println(Thread.currentThread().getName());

            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            thread.interrupt();
        }


}
