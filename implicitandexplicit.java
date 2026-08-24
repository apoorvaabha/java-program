public class implicitandexplicit {
    
    public static void main(String[] args) {
        int radius = 500;
        double newRadius = radius; // Implicit type casting
        System.out.println(newRadius);
        // Explicit type casting

        double diameter = 800.25;
        int newDiameter = (int) diameter; // Explicit type casting
        System.out.println(newDiameter);
    }
}
