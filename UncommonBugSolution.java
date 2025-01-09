public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            if (y == 0) {
                System.out.println("Cannot divide by zero.");
            } else {
                int z = x / y;
                System.out.println(z);
            }
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        String str = null;
        try {
            if (str != null) {
                int len = str.length();
                System.out.println(len);
            } else {
                System.out.println("String is null.");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        System.out.println("Program continues after exceptions.");
    }
}