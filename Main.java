import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        //Ex1
        System.out.print("please enter your role: ");
        String role = in.nextLine();
        if(role.equalsIgnoreCase("admin"))
        {
            System.out.println("welcome admin");
        }
        else if(role.equalsIgnoreCase("superuser"))
        {
            System.out.println("welcome superuser");
        }
        else if(role.equalsIgnoreCase("user"))
        {
            System.out.println("welcome user");
        }
        else
            System.out.println("The role is not here");
        System.out.println("-----------------------------");

        //Ex2
        System.out.print("input the 1st number: ");
        int x = in.nextInt();
        System.out.print("input the 2nd number: ");
        int y = in.nextInt();
        System.out.print("input the 3rd number: ");
        int z = in.nextInt();

        if(x>y && x>z)
        {
            System.out.println("The greatest = " + x);
        }
        else if(y>z)
        {
            System.out.println("The greatest = " + y);
        }
        else
            System.out.println("The greatest = " + z);
        System.out.println("-----------------------------");

        //Ex3
        System.out.print("Enter number: ");
        int day = in.nextInt();

        switch(day)
        {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("this is wrong");
        }
        System.out.println("-----------------------------");

        //Ex4
        System.out.print("Enter your numeric: ");
        int num = in.nextInt();

        if(num>100 && num<0)
        {
            System.out.println("Enter number between 100 and 0");
        }
        else if(num<=100 && num>=90)
        {
            System.out.println("numeric = " + num);
            System.out.println("Grade: A");
        }
        else if(num<=89 && num>=80)
        {
            System.out.println("numeric = " + num);
            System.out.println("Grade: B");
        }
        else if(num<=79 && num>=70)
        {
            System.out.println("numeric = " + num);
            System.out.println("Grade: C");
        }
        else if(num<=69 && num>=60)
        {
            System.out.println("numeric = " + num);
            System.out.println("Grade: D");
        }
        else if(num<=59 && num>=0)
        {
            System.out.println("numeric = " + num);
            System.out.println("Grade: F");
        }
        System.out.println("-----------------------------");

        //Ex5

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if(age < 13)
        {
            System.out.println("Your are a child");
        }
        else if(age >= 13 && age < 20)
        {
            System.out.println("Your are a teenager");
        }
        else if(age >= 20)
        {
            System.out.println("Your are an adult");
        }
        else
            System.out.println("this is wrong");
    }
}