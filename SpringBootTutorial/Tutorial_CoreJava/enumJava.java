package SpringBootTutorial.Tutorial_CoreJava;

import com.sun.net.httpserver.Authenticator;

// enum are used to give constant names { unchangeable variables or like final static values
// example of enum
enum status
{
    Running, Failed, Success, Pending;
    // you have to call these values as per your choice
    // by default counting starts from Running and it is allotted 0
}
public class enumJava
{
    public static void main(String[] args)
    {
        status obj = status.Success;// in this we are giving output as Success
        status obj1 = status.Running;// in this we are giving output as Running
        status obj2 = status.Failed;// in this we are giving output as Failed
        status obj3 = status.Pending;// in this we are giving output as Pending
        System.out.println(obj);
        System.out.println(obj3);
        // now lets print then
        System.out.println(obj + " " + obj1 + " " + obj2 + " " + obj3);
        // now lets print this with for loop , for using loops we need to find .values { just same as .length for array }
        // for using .values we need to create an array first
        status[] loop = status.values();
        for (int i = 0 ; i<loop.length ;i++ )
        {
            System.out.println(i+" : "+loop[i]);
        }
        // If-Else for enum
        if (obj == status.Success)
        {
            System.out.println("It's done");
        } else if (obj == status.Failed)
        {
            System.out.println("It's Failed");
        } else if (obj == status.Pending)
        {
            System.out.println("PLease Wait");
        }else
        {
            System.out.println("Good to go #Running guys");
        }
        // switch-case with enum
        // refer line number 20, status obj3 = status.Pending;
        switch (obj3)
        {
            case Running :
                System.out.println("All Good Guys, It's Running");
                break;
            case Success :
                System.out.println("We did it Guys!");
                break;
            case Failed :
                System.out.println("Failed Guys! Try Again");
                break;
            default :
                System.out.println("Please wait a bit more");
        }
    }
}
