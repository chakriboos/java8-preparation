package learn.threads.copy.paste.code;

// Java program to explain the
// concept of joining a thread.
import java.io.*;
  
// Creating thread by creating the
// objects of that class
class ThreadJoining extends Thread
{
    @Override
    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try
            {
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName());
                Thread.sleep(10000);
            }
  
            catch(Exception ex)
            {
                System.out.println("Exception has" +
                                " been caught" + ex);
            }
            System.out.println(i);
        }
    }
}
  
public class JoinDemo
{
    public static void main (String[] args)
    {
  
        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();
  
        // thread t1 starts
        t1.start();
  
        // starts second thread after when
        // first thread t1 has died.
        try
        {
            System.out.println("Current Thread: "
                  + Thread.currentThread().getName());
            t1.join(3000);
            System.out.println("T1 join method execution completed");
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
  
        // t2 starts
        t2.start();
  
        // starts t3 after when thread t2 has died.
        try
        {
            System.out.println("Current Thread: "
                 + Thread.currentThread().getName());
            t2.join(3000);
            System.out.println("T2 join method execution completed");
        }
  
        catch(Exception ex)
        {
            System.out.println("Exception has been" +
                                    " caught" + ex);
        }
  
        t3.start();
    }
}