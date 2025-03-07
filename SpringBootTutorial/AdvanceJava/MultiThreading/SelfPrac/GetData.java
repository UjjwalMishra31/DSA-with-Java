package SpringBootTutorial.AdvanceJava.MultiThreading.SelfPrac;

public class GetData
{
    public static void main(String[] args) throws InterruptedException {
        StudData colldata = new College();
        StudData deptdata = new AIDS_DEPT();
        System.out.println(Thread.currentThread().getName() + " started fetching");
        long startTime = System.currentTimeMillis();
        colldata.studDataDisplay();
        deptdata.studDataDisplay();
        System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
    }
}
