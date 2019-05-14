package Exercise2;
class Member{

    public String name;
    public int age;
    public float salary;
    Member(String name,int age,float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
}

public class MemberVariable {
    public static void main(String[] args)
    {
        Member obj=new Member("sakshi",22,21000.00f);
        System.out.println("Name "+obj.name);
        System.out.println("Age "+obj.age);
        System.out.println("Salary "+obj.salary);
    }
}
