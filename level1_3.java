import java.util.Scanner;

public class level1_3 {
    public static void main(String[] args) {
        int n;
        int mul[] = new int[10];
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = inp.nextInt();
        inp.close();
        for (int i = 0; i < mul.length; i++) {
            mul[i] = n * (i + 1);
            System.out.println(n + " x " + (i + 1) + " = " + mul[i]);
        }
    }
}
