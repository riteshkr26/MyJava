class MyThread extends Thread
{
       public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+"MyThrad");
            i++;
        }
    }
}

 public class ThreadTest2
{
    
    public static void main(String[] args) throws Exception {

        MyThread t=new MyThread();
        
        t.setDaemon(true);
        t.start();
//Thread mainThread = Thread.currentThread();
//mainThread.join();

       /* int i=1;
        while(true)
        {
            System.out.println(i+"main");
i++;
Thread.yield();
        }
*/
    }

}