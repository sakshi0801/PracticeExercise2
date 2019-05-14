package Exercise2;

import java.util.Scanner;

public class PalindromeRev {
    public static String reverse(String input)
    {
        String revString="";
        for (int flag=input.length()-1;flag>=0;flag--)
        {
            revString+=input.charAt(flag);
        }
        return revString;
    }

    public static boolean checkPalindrome(String input,String revString)
    {
        if(input.equals(revString))
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String input=sc.nextLine();
        String revString=reverse(input);
        if(checkPalindrome(input,revString))
        {
            System.out.println(input+" is Palindrome");
        }
    }
}
