
package lecture3;

import java.util.Scanner;

public class Practice2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        if(scanner.hasNext()){
            String input = scanner.next();
            System.out.println("You entered: " +input);
        }
        
    }
    
}
