public class MathOperations {

  // Add two numbers
  public static int add(int a, int b) {
      return a + b;
  }

  // Subtract two numbers
  public static int subtract(int a, int b) {
      return a - b;
  }

  // Multiply two numbers
  public static int multiply(int a, int b) {
      return a * b;
  }

  // Divide two numbers (returning a double to handle non-integer division)
  public static double divide(int a, int b) {
      if (b == 0) {
          throw new ArithmeticException("Cannot divide by zero");
      }
      return (double) a / b;
  }

  // Calculate the square root of a number
  public static double squareRoot(double a) {
      if (a < 0) {
          throw new IllegalArgumentException("Cannot calculate square root of a negative number");
      }
      return Math.sqrt(a);
  }

  public static void main(String[] args) {
      // Example usage
      int num1 = 10;
      int num2 = 5;

      System.out.println("Addition: " + add(num1, num2));
      System.out.println("Subtraction: " + subtract(num1, num2));
      System.out.println("Multiplication: " + multiply(num1, num2));

      try {
          System.out.println("Division: " + divide(num1, num2));
      } catch (ArithmeticException e) {
          System.out.println("Error: " + e.getMessage());
      }

      double num3 = 25.0;
      System.out.println("Square Root: " + squareRoot(num3));
  }
}
