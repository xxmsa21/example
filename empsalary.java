import java.util.Scanner;
public class empsalary {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("No. of hours the employee works per week: ");
        int hours_perweek = scan.nextInt();
        System.out.println("Amount of money the employee makes per week: ");
        double weekly_amount = scan.nextInt();
        System.out.println("No. of vacation days: ");
        int vac_days = scan.nextInt();
        double sal = annual_sal(hours_perweek, weekly_amount, vac_days);
        System.out.println("The gross annual income of the employee is: " + sal);
    }
    public static double annual_sal(int hours, double weekly, int vac_days){
        double annual_salary = hours * weekly * 52;
        double unpaid  = vac_days * hours * 8;
        return (annual_salary - unpaid);
    }
}
