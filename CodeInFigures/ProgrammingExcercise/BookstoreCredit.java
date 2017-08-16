package ProgrammingExcercise;

/**
 * Created by jc428795 on 16/08/17.
 */
import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String studentName;
        double gradePointAverage;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Student's name: ");
        studentName = keyboard.nextLine();
        System.out.print("Enter the grade point average: ");
        gradePointAverage = keyboard.nextDouble();
        keyboard.nextLine();

        compute(studentName, gradePointAverage);
    }
    private static void compute(String studentName, double gradePointAverage)
    {
        double discount = 10*gradePointAverage;

        System.out.println(studentName + " has a GPA of " + gradePointAverage + "." + "This is a bookstore discount of $" + discount);
    }
}
