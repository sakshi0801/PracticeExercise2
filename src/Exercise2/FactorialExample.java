package Exercise2;

import java.util.Scanner;

public class FactorialExample {
    public static void intFactorial(int limit)
    {
        int factorial;
        for(int flag=1;flag<=limit;flag++)
        {
            factorial=1;
            for(int flag2=1;flag2<=flag;flag2++)
            {
                factorial=factorial*flag2;
            }
            System.out.println("Factorial of "+flag+" is "+factorial);
        }
    }

    public static void longFactorial(int limit)
    {
        long factorial;
        for(int flag=1;flag<=limit;flag++)
        {
            factorial=1;
            for(int flag2=1;flag2<=flag;flag2++)
            {
                factorial=factorial*flag2;
            }
            System.out.println("Factorial of "+flag+" is "+factorial);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit");
        int limit=sc.nextInt();
        System.out.println("intFactorial");
        intFactorial(limit);

        System.out.println("longFactorial");
        longFactorial(limit);
    }
}
