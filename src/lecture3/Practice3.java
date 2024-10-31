
package lecture3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        if(scanner.hasNextInt()){
            int input = scanner.nextInt();
            System.out.println("Your integer: " +input);
        }else{
            System.out.println("That is not an integer.");
        }
    }
}
