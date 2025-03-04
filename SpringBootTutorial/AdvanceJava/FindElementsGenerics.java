package SpringBootTutorial.AdvanceJava;

import java.util.Scanner;

// Generic class using arrays
class GenericArray<T> {
    private T[] items;

    // Constructor to initialize the array
    public GenericArray(T[] items) {
        this.items = items;
    }

    public void display() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    // Method to get an item by index
    public T getItem(int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        } else {
            return null; // Return null if index is out of bounds
        }
    }
}

// Course class
class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name; // Returning just the course name
    }
}

// StudentLaptop class
class StudentLaptop {
    private String brand;

    public StudentLaptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand; // Returning just the brand name
    }
}

// Main class
public class FindElementsGenerics {
    public static void main(String[] args) {
        // Creating an array of Courses
        Course[] courses = { new Course("Java Basic"), new Course("Java Advanced"), new Course("Spring Boot"),new Course("Hibernate") };
        GenericArray<Course> courseArray = new GenericArray<>(courses);
        int courselength = courses.length - 1;

        // Creating an array of StudentLaptops
        StudentLaptop[] laptops = { new StudentLaptop("Dell"), new StudentLaptop("HP"), new StudentLaptop("Apple"),new StudentLaptop("Asus")};
        GenericArray<StudentLaptop> laptopArray = new GenericArray<>(laptops);
        int laptoplength = courses.length - 1;

        // Displaying Courses
        System.out.println("Courses List:");
        courseArray.display();

        // Displaying StudentLaptops
        System.out.println("\nStudent Laptops List:");
        laptopArray.display();

        // Taking user input
        Scanner scanner = new Scanner(System.in);

        // Getting a course by index
        System.out.print("\nEnter course index (0-"+ courselength +" ): ");
        int courseIndex = scanner.nextInt();
        Course selectedCourse = courseArray.getItem(courseIndex);
        if (selectedCourse != null) {
            System.out.println("Selected Course: " + selectedCourse);
        } else {
            System.out.println("Invalid index!");
        }

        // Getting a student laptop by index
        System.out.print("\nEnter student laptop index (0-"+laptoplength+"): ");
        int laptopIndex = scanner.nextInt();
        StudentLaptop selectedLaptop = laptopArray.getItem(laptopIndex);
        if (selectedLaptop != null) {
            System.out.println("Selected Student Laptop: " + selectedLaptop);
        } else {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}
