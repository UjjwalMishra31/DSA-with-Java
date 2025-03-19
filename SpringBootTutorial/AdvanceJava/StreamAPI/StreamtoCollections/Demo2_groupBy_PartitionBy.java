package SpringBootTutorial.AdvanceJava.StreamAPI.StreamtoCollections;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo2_groupBy_PartitionBy
{
    public static void main(String[] args)
    {
        List<StreamEmployee> employeeList = EmpData.populateStreamEmployees();

        System.out.println("---Using GroupBy--- ");
        System.out.println();
        Map<Integer,List<StreamEmployee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(StreamEmployee::getEmpid, Collectors.toList()));
        map.entrySet().forEach(System.out::println);
        System.out.println();

        System.out.println("---Using PartitionBy---");
        Map<Boolean,List<StreamEmployee>> map2= employeeList.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() >= 45,Collectors.toList()));
        map2.entrySet().forEach(System.out::println);
    }
}
