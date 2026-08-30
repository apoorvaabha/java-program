public class stringconcatentaion {
    public static void main(String[] args) {
        String firstname = "hello ";
        String lastname = "World!";
        //+
        String fullname = firstname +" "+ lastname;
        System.out.println(fullname);
        //concat method
        String fullname2 = firstname.concat(" ").concat(lastname);
        System.out.println(fullname2);
    }
}