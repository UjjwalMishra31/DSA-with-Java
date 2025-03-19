package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;
import java.util.Optional;

public class Demo3_min_max_Reduce
{
    public static void main(String[] args)
    {
        List<NewEmployee> list = EmployeeData2.populateStreamEmployees();
        // finding the min age emp
        // using optional
        Optional<NewEmployee> optional = list.stream().min(((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println("min Age using optional & min using stream \n"+optional);

        System.out.println();

        // finding the max age using optional
        Optional<NewEmployee> optional1 = list.stream().max(((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println("max Age using optional & max using stream \n"+optional1);
        System.out.println();

        // using reduce
        // use to add values in a list
        // here we will add   Age
        Optional<Integer> optional2 = list.stream()
                .map(emp -> emp.getAge())
                .reduce((age1,age2) -> age1 + age2);
        System.out.println("Sum of all Age of employees is : "+optional2);
        System.out.println();

        // using reduce using extra value
        // use to add values in a list with extra value
        // here we will add   Age with a extra value
        Integer optional3 = list.stream()
                .map(emp -> emp.getAge())
                .reduce(1000 ,(age1,age2) -> age1 + age2);
        System.out.println("Sum of all Age of employees with 1000 is : "+optional3);
    }
}
