package Exercise2;

        import java.util.Scanner;

public class ComputeGrade {

    //This will find average grade
    public static float averageGrade(int[] grades)
    {
        float avg=0;
        int sum=0;
        for(int flag=0;flag<grades.length;flag++)
        {
            sum=sum+grades[flag];
        }
        avg=sum/grades.length;
        return avg;
    }

    //This will find min grade
    public static int minimumGrade(int[] grades)
    {
        int min=grades[0];
        for (int flag=0;flag<grades.length;flag++)
        {
            if(grades[flag]<min)
            {
                min=grades[flag];
            }
        }
        return min;
    }

    // This will find max grade
    public static int maximumGrade(int[] grades)
    {
        int max=0;
        for (int flag=0;flag<grades.length;flag++)
        {
            if(grades[flag]>max)
            {
                max=grades[flag];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students ");
        int count=sc.nextInt();
        int[] grades=new int[count];
        for(int flag=0;flag<count;flag++)
        {
            System.out.println("Enter grade for student "+(flag+1));
            grades[flag]=sc.nextInt();
        }
        //calling functions
        float avg=averageGrade(grades);
        int min=minimumGrade(grades);
        int max=maximumGrade(grades);
        //display grades
        System.out.println("Average grade is "+avg);
        System.out.println("Minimum grade is "+min);
        System.out.println("Maximum grade is "+max);
    }
}
