public class stringsplitting {
    public static void main(String[] args) {
        String str = "Hello, World!";
        // split() method
        String[] parts = str.split(", ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
