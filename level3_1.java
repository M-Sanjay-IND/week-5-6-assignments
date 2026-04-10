import java.util.Scanner;

public class level3_1 {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = inp.nextInt();
        inp.close();
        int freq[] = new int[11];
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println("The digit " + i + " appears " + freq[i] + " times");
            }
        }
    }
}