import java.util.Scanner;

public class level2_1 {
    public static void main(String[] args) {
        double salary[] = new double[10];
        int serviceYears[] = new int[10];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            System.out.print("Enter salary " + (i + 1) + ": ");
            salary[i] = inp.nextDouble();
            System.out.print("Enter service years " + (i + 1) + ": ");
            serviceYears[i] = inp.nextInt();
        }
        inp.close();
        for (int i = 0; i < salary.length; i++) {
            if (serviceYears[i] > 5) {
                salary[i] += salary[i] * 0.05;
            } else {
                salary[i] += salary[i] * 0.02;
            }
            System.out.println("The salary of employee " + (i + 1) + " is: " + salary[i]);
        }
    }
}
