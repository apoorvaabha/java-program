public class assignmentoperator {
    public static void main(String[] args) {
        int number = 10;
        number += 5; // Equivalent to number = number + 5
        System.out.println("After addition assignment, number = " + number);
        
        number -= 3; // Equivalent to number = number - 3
        System.out.println("After subtraction assignment, number = " + number);
        
        number *= 2; // Equivalent to number = number * 2
        System.out.println("After multiplication assignment, number = " + number);
        
        number /= 4; // Equivalent to number = number / 4
        System.out.println("After division assignment, number = " + number);
        
        number %= 3; // Equivalent to number = number % 3
        System.out.println("After modulus assignment, number = " + number);
    }
    
}
