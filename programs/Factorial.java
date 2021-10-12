    import java.util.Scanner;

    class Factorial {
      //REcursive Function for factorial Calculation
      static int factorial(int n) {
        if (n == 0)
          return 1;
        else
          return (n * factorial(n - 1));
      }

      public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number TO Calculate Factorial : ");
        int number = sc.nextInt();
        sc.close();

        int fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
      }
    }
