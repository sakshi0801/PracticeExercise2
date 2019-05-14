package Exercise2;

import java.util.Scanner;

public class EvenNumTest {
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int number=sc.nextInt();
        if(isEven(number))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
