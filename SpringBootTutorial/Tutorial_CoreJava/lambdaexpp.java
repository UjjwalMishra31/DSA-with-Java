package SpringBootTutorial.Tutorial_CoreJava;
@FunctionalInterface
interface newfunc
{
    public int arya(int i);
}
@FunctionalInterface
interface newaddfunc
{
    public int  add(int m, int n);
}
public class lambdaexpp
{
    public static void main(String[] args)
    {
        // use -> instead of all of this for making the code shorter
//        newfunc obj = new newfunc(i)
//        {
//            @Override
//            public void arya(int i) {
//
//            }
//        };

        // lambda expression (->)
        newfunc obj1 = i -> {
            System.out.println("Use Lambda expression." +i);
            return 0;
        };
        obj1.arya(5);
        // new way of lambda expression for newaddfunc interface

        newaddfunc add1 = (m, n) -> m + n;
        int sum = add1.add(10,20);
        System.out.println("Sum of two numbers is : "+sum);
    }
}
