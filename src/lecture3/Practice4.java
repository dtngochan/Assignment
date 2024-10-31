package lecture3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();       
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();
        
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy"); // Định dạng đầu ra
        String formattedDate = "";
        try {
            Date date = inputFormat.parse(inputDate);
            formattedDate = outputFormat.format(date);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please try again.");
        }
        
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
        if (!formattedDate.isEmpty()) {
            System.out.println("Date of birth has been formatted: " + formattedDate);
        }
        System.out.println("Set: " + sex);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("Hometown: " + hometown);
    }
}