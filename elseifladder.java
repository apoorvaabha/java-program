public class elseifladder {
    
    public static void main(String[] args) {
        int per = 65;
        //print grade based on percentage
        //A--> (90,100)
        //B--> (80,90)
        //C--> (70,80)
        //D--> (60,70)
        //F--> (<60)
        //if else ladder
        if (per > 90 && per <= 100) {
            System.out.println("Grade: A");
        } else if (per > 80 && per <= 90) {
            System.out.println("Grade: B");
        } else if (per > 70 && per <= 80) {
            System.out.println("Grade: C");
        } else if (per > 60 && per <= 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }    }
    }
        