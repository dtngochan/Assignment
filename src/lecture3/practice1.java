package lecture3;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your sex: ");
        String sex = scanner.next();
        scanner.nextLine();
        System.out.println("Enter your major: ");
        String major = scanner.nextLine();
        System.out.println("Enter your GPA: ");
        float GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter your hometown: ");
        String hometown = scanner.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Hometown: " + hometown);
    }
}
