public class logicaloperator{

    public static void main(String[] args) {
 
        int num1 = 10;
        int num2 = 20;

        int x = 50;
        int y = 100;
        
        boolean result = (num1 < num2) && (x < y);    //true && true
        System.out.println(result);
        
        boolean result1 = (num1 > num2) || (x < y);   //false || true
        System.out.println(result1);
    
        boolean result2 = !(num1>num2);               // !false
        System.out.println(result2);
        // decision making
    }
}