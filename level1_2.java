import java.util.Scanner;

public class level1_2 {

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPositive(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int nums[] = new int[5];
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = inp.nextInt();
        }
        inp.close();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println("zero");
            } else if (isEven(nums[i]) && isPositive(nums[i])) {
                System.out.println("positive even");
            } else if (!isEven(nums[i]) && isPositive(nums[i])) {
                System.out.println("positive odd");
            } else {
                System.out.println("negative");
            }
        }
        if (nums[0] == nums[nums.length - 1]) {
            System.out.println("The first and last numbers are the same");
        }
    }
}
