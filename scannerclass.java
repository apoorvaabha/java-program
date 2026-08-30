 import java.util.Scanner;
    public class scannerclass {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //ask a question
            System.out.println("Enter your name?: ");
            //respose
            String name = scanner.nextLine();
            //display that respose
            System.out.println("Hello, " + name + "!");
        }
    }     

