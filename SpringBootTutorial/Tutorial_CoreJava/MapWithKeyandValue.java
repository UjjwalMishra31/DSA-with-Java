package SpringBootTutorial.Tutorial_CoreJava;

import java.util.HashMap;
import java.util.Map;

public class MapWithKeyandValue
{
    public static void main(String[] args)
    {
        // Map is used to store values with keys , you can use any thing as per your requirement
        Map<String,Integer> students = new HashMap<>();
        students.put("Ujjwal",30);
        students.put("Sudip",20);
        students.put("Dolly",40);
        students.put("Tanishq",33);
        // keys are unique and you cannot update it , but can update values
        students.put("Sudip",60);
        // for printing the map
        System.out.println(students);
        System.out.println("This will only print name i.e. students.keySet() : "+students.keySet());
        // printing map with enhanced for loop
        // use students.get to get the values of the particular keys
        for (String key : students.keySet())
        {
            System.out.println(key+" : "+students.get(key));
        }
    }
}
