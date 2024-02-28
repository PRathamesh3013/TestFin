//Write a Java program to check if the given number is a prime number.

import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		System.out.println("enter number");
  		int num = sc.nextInt();
        
          boolean flag = true;
          for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
              flag = false;
              break;
            }
          }
          if (flag) {
            System.out.println("number is prime number : " + num);
          }
    		 else {
    			System.out.println("number is not a prime number : " + num);
    		
        }
        }
}
