package Exercise2;

import java.util.Scanner;

public class PowerFour {
    public static boolean findPower(int num){
        int temp=num;
        while(temp>=4)
        {
            temp=temp/4;
        }
        if(temp!=1)
        {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int num=sc.nextInt();
        if(findPower(num))
        {
            System.out.println("Power of 4");
        }
        else {
            System.out.println("Not a power of 4");
        }
    }
}
