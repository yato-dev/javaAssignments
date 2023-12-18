import java.util.Scanner;

public class LeapYear {
    public static void main( String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the year");
        int year=scanner.nextInt();

        if( year<1000 && year>9999)//condition check for invalid inputs
        {
            System.out.println("Invalid Input");
            return;
        }

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )//logic
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("False");
        }

        scanner.close();
    }
}
