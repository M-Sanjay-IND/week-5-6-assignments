import java.util.Scanner;

public class level1_1 {
    static boolean canVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ages[] = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age " + (i + 1) + ": ");
            ages[i] = inp.nextInt();
        }
        for (int i = 0; i < ages.length; i++) {
            if (canVote(ages[i])) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
        inp.close();
    }
}