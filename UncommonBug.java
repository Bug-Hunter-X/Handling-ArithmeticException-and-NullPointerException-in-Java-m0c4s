public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        String str = null;
        try {
            int len = str.length(); // Potential NullPointerException
            System.out.println(len);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        System.out.println("Program continues after exceptions.");
    }
}