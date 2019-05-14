package Exercise2;

import java.util.Scanner;

public class PowerFour {
    public static boolean findPower(int num){
        int temp=num;
        int remainder=0;
        while(temp>=4)
        {
            remainder=temp%4;
            temp=temp/4;

        }
        if(temp==1 && remainder==0)
        {
            return true;
        }
        else {
            return false;
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
