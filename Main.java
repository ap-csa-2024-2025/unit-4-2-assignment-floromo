import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    problem1();
    problem2();
  }


  public static void problem1(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two numbers: ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    int i = 1;
    while (i < (Math.abs(num1 - num2)+1)){
      if ((num1 + i) % 2 != 0){
        System.out.print((num1 + i) + " ");
      }
      i++;
    }
  }


  public static void problem2(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a positive integer: ");
    int N = sc.nextInt();

    int degree = 0;
    while (N > 0){
      int lastDigit = N % 10;
      N /= 10;

      double placeVal = Math.pow(10, degree);
      System.out.println(lastDigit * placeVal);

      degree++;
    }
  }
}
