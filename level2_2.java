import java.util.Scanner;

public class level2_2 {
    static int heightMax(int arr[]) {
        int max = arr[0];
        int max_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }

    static int ageMin(int arr[]) {
        int min = arr[0];
        int min_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int friendsHeight[] = new int[3];
        int friendsAge[] = new int[3];
        for (int i = 0; i < friendsHeight.length; i++) {
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            friendsHeight[i] = inp.nextInt();
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            friendsAge[i] = inp.nextInt();
        }
        inp.close();
        int tallestFriendIndex = heightMax(friendsHeight);
        int youngestFriendIndex = ageMin(friendsAge);
        System.out.println("The friend " + (tallestFriendIndex + 1) + " is the tallest with a height of "
                + friendsHeight[tallestFriendIndex]);
        System.out.println("The friend " + (youngestFriendIndex + 1) + " is the youngest with an age of "
                + friendsAge[youngestFriendIndex]);
    }
}