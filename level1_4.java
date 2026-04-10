import java.util.Scanner;

public class level1_4 {
    public static void main(String[] args) {
        double nums[] = new double[10];
        Scanner inp = new Scanner(System.in);
        int i = 0, sum = 0;
        while (true && i < nums.length) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = inp.nextDouble();
            if (nums[i] <= 0) {
                break;
            }
            sum += nums[i];
            i++;
        }
        inp.close();
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
