package Thread;

import org.w3c.dom.ls.LSOutput;

public class DownloadFileTask implements Runnable{
    @Override
    public void run() {

        System.out.println("Downloading a file :" +Thread.currentThread().getName());
        for(int i = 0; i < Integer.MAX_VALUE ; i++)
        {
            if(Thread.currentThread().isInterrupted()) break;
            System.out.println("downloading byte:" +i);
        }
        System.out.println("Download Completed :" +Thread.currentThread().getName());
    }
}
