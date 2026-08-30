public class stringformatting {
    public static void main(String[] args) {
        String str1 = "James";
        int marks = 95;
        // string format()
        String str2 = String.format("Student marks: %d, Computer language : %s", marks, str1);
        System.out.println(str2);   
    }
}
