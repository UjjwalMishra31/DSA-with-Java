package SpringBootTutorial.AdvanceJava.MultiThreading.DeamonThread;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Executing loop thread " + Thread.currentThread().getName());
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}