package semana8;
import java.util.Scanner;

// River Alejandro Bonilla Florez
// Diseno de software cuarto semestre
// 2024-10-03
// 

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an example:");
        System.out.println("1. Circle and Cylinder example");
        System.out.println("2. Person, Student and Staff example");
        System.out.println("3. Rectangle, Square and Circle example SHAPE");
        System.out.println("4. Cat and Dog example");
        int exampleChoice = scanner.nextInt();

        switch (exampleChoice) {
            case 1:
            Circle c1 = new Circle(5.0, "white");
            System.out.println(c1.toString());

            Cylinder cy1 = new Cylinder(4.0, 2.0, "yellow");
            System.out.println(cy1.toString());
            break;

            case 2:
            Person p1 = new Person("John", "252 person address");
            System.out.println( p1.toString());

            Student s1 = new Student("Jane", "124 example address student", "software developer", 2020, 1000.0);
            System.out.println(s1.toString());

            Staff st1 = new Staff("Jack", "123 example address staff", "UCC", 2000.0);
            System.out.println(st1.toString());

            break;
            case 3:
            Shape shape = new Shape();
            System.out.println("Shape: " + shape.toString());

            CircleShape circle = new CircleShape(2.5);
            System.out.println("Circle: " + circle.toString());

            Rectangle rectangle = new Rectangle();
            System.out.println("Rectangle: " + rectangle.toString());

            Square square = new Square();
            System.out.println("Square: " + square.toString());

            break;

            case 4:
            boolean exit = false;
            while (!exit) {
                System.out.println("Choose an option:");
                System.out.println("1. Create and display Cat object");
                System.out.println("2. Create and display Dog object");
                System.out.println("3. Dog greets another Dog");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Cat cat = new Cat("Whiskers");
                        System.out.println(cat.toString());
                        cat.greets();
                        break;

                    case 2:
                        Dog dog = new Dog("Buddy");
                        System.out.println(dog.toString());
                        dog.greets();
                        break;
                    
                    case 3:
                        Dog dog1 = new Dog("Buddy");
                        Dog dog2 = new Dog("Max");
                        System.out.println("Dog1 greets Dog2: ");
                        dog1.greets(dog2);
                        System.out.println("Dog1: " + dog1.toString());
                        System.out.println("Dog2: " + dog2.toString());
                        break;

                    case 4:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }

            


            default:
            System.out.println("Invalid example choice");
            break;
        }

        scanner.close();
    }
}