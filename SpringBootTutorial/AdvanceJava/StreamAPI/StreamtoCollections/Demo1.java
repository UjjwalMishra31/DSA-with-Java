package SpringBootTutorial.AdvanceJava.StreamAPI.StreamtoCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo1
{
    public static void main(String[] args)
    {
        List<StreamEmployee> emplist = EmpData.populateStreamEmployees();

        System.out.println("Stream to array");
        System.out.println();
        StreamEmployee[] array = emplist.stream().toArray(StreamEmployee[]::new);
        for (StreamEmployee emp : emplist)
        {
            System.out.println(emp);
        }
        System.out.println();

        System.out.println("Stream to List");
        List<StreamEmployee> list = emplist.stream().collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream to Set");
        Set<StreamEmployee> set = emplist.stream().collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println();

        System.out.println("Stream to Map");
        Map<Integer,StreamEmployee> map = emplist.stream()
                .collect(Collectors.toMap(
                        StreamEmployee::getEmpid,
                        emp -> emp ,
                        (emp1,emp2)-> emp2));
        map.entrySet().forEach(System.out::println);

    }
}
