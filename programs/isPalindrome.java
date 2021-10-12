  import java.util.Scanner;
  
  class isPalindrome {
      public static void main(String args[]) {
        int r, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number To Check Palindrome : ");
        int n = sc.nextInt();     // It is the number variable to be checked for palindrome  
        sc.close();
        
        temp = n;
        while (n > 0) {
          r = n % 10; //getting remainder  
          sum = (sum * 10) + r;
          n = n / 10;
        }
        if (temp == sum)
          System.out.println("palindrome number ");
        else
          System.out.println("not palindrome");
      }
    }
