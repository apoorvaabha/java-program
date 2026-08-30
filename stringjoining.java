public class stringjoining {
    public static void main(String[] args) {
        String firstname = "Hello";
        String lastname = "World!";
        // join() method
        String fullname = String.join(" ", firstname, lastname);
        System.out.println(fullname);
    }
}
