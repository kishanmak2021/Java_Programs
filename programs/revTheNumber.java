/**
 * reverseTtheNum
 */

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    // TAKING INPUT USING SCANNER OBJECT
    
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter The Number : ");
    int number = sc.nextInt (); 
    sc.close ();


    int reverse = 0;

//   REVERSING THE NUMBER USING LOOP
    while (number != 0)
    {
	int remainder = number % 10;
	reverse = reverse * 10 + remainder;
	number = number / 10;
    }

    //  PRINTING FINAL ANSWER
    
    System.out.println ("Your Reversed Number is " + reverse);



  }

}
